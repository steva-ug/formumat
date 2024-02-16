package digital.steva.formumat.schema

import digital.steva.formumat.helpers.Convert
import digital.steva.formumat.helpers.flattenStringKeyMap
import digital.steva.formumat.redux.Boolish
import digital.steva.formumat.redux.Evaluatable
import digital.steva.formumat.redux.Intish
import digital.steva.formumat.redux.Numberish
import digital.steva.formumat.redux.Stringish
import kotlinx.serialization.Polymorphic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

interface HasProperties {
    val properties: Map<String, Type>
    val requiredProperties: List<String>?
}

@Serializable
@SerialName("dataSchema")
data class DataSchema(
    override val properties: Map<String, Type>,
    @SerialName("required")
    override val requiredProperties: List<String>? = null,
    @Transient val typesByKey: Map<String, Type> = emptyMap()
) : HasProperties

@Polymorphic
interface Type {
    val default: Evaluatable?
    val required: Boolean
    fun convertToType(value: Any?): Any = Unit
}

enum class StringFormat {
    @SerialName("date")
    DATE,

    @SerialName("time")
    TIME,

    @SerialName("date-time")
    DATE_TIME,

    @SerialName("password")
    PASSWORD,

    @SerialName("email")
    EMAIL,
}

@Serializable
@SerialName("object")
data class ObjectType(
    override val properties: Map<String, Type>,
    @SerialName("required")
    override val requiredProperties: List<String>? = null,
    override val default: Stringish? = null,
    @Transient override val required: Boolean = false
) : Type, HasProperties

@Serializable
@SerialName("array")
data class ArrayType(
    override val default: Stringish? = null,
    @Transient override val required: Boolean = false,
    val items: ObjectType
) : Type

@Serializable
@SerialName("boolean")
data class BooleanType(
    override val default: Boolish? = null,
    @Transient override val required: Boolean = false
) : Type {
    override fun convertToType(value: Any?) = Convert.toBoolean(value)
}

interface EnumerableType : Type {
    val enum: List<Any>?
    val enumValues: List<Any>?
    fun getValue(index: Any?): Any? = enum?.indexOf(index)?.let { enumValues?.get(it) }
}

@Serializable
@SerialName("string")
data class StringType(
    val format: StringFormat? = null,
    override val enum: List<String>? = null,
    override val enumValues: List<Int>? = null,
    override val default: Stringish? = null,
    @Transient override val required: Boolean = false
) : EnumerableType {
    override fun convertToType(value: Any?) = Convert.toString(value)
}


@Serializable
@SerialName("integer")
data class IntegerType(
    override val enum: List<Int>? = null,
    override val enumValues: List<Int>? = null,
    override val default: Intish? = null,
    @Transient override val required: Boolean = false
) : EnumerableType {
    override fun convertToType(value: Any?) = Convert.toInt(value)
}

@Serializable
@SerialName("number")
data class NumberType(
    override val enum: List<Int>? = null,
    override val enumValues: List<Int>? = null,
    override val default: Numberish? = null,
    @Transient override val required: Boolean = false
) : EnumerableType {
    override fun convertToType(value: Any?) = Convert.toDouble(value)
}

fun parseDataSchema(json: String): DataSchema {
    val parser = Json {
        serializersModule = SerializersModule {
            polymorphic(Type::class) {
                subclass(StringType::class, StringType.serializer())
                subclass(BooleanType::class, BooleanType.serializer())
                subclass(IntegerType::class, IntegerType.serializer())
                subclass(NumberType::class, NumberType.serializer())
                subclass(ObjectType::class, ObjectType.serializer())
                subclass(ArrayType::class, ArrayType.serializer())
            }
        }
        ignoreUnknownKeys = true
    }

    val dataSchema: DataSchema = parser.decodeFromString(json)

    fun setRequiredFlagInAllProperties(withProperties: HasProperties): Map<String, Type> {
        return withProperties.properties.mapValues { (name, type) ->
            val required = withProperties.requiredProperties?.contains(name) == true
            when (type) {
                is BooleanType -> type.copy(required = required)
                is IntegerType -> type.copy(required = required)
                is StringType -> type.copy(required = required)
                is ObjectType -> type.copy(
                    required = required,
                    properties = setRequiredFlagInAllProperties(type)
                )

                else -> type
            }
        }
    }

    val updatedProperties = setRequiredFlagInAllProperties(dataSchema)

    return dataSchema.copy(
        properties = updatedProperties,
        typesByKey = flattenStringKeyMap(
            updatedProperties,
            { it is ObjectType || it is ArrayType },
            {
                when (it) {
                    is ObjectType -> it.properties
                    is ArrayType -> it.items.properties
                    else -> emptyMap()
                }
            },
            addContainers = true
        )
    )
}
