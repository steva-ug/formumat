package digital.steva.formumat.redux

import androidx.compose.ui.text.intl.Locale
import co.touchlab.kermit.Logger
import com.github.murzagalin.evaluator.DefaultFunctions
import com.github.murzagalin.evaluator.Evaluator
import digital.steva.formumat.FormumatConfig
import digital.steva.formumat.helpers.MapDecorator
import digital.steva.formumat.helpers.orElse
import digital.steva.formumat.schema.Field
import digital.steva.formumat.schema.Type
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.MapEntrySerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.boolean
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.double
import kotlinx.serialization.json.doubleOrNull
import kotlinx.serialization.json.int
import kotlinx.serialization.json.intOrNull

val evaluator by lazy {
    Evaluator(
        functions = DefaultFunctions.ALL + Functions.ALL + FormumatConfig.functions
    )
}

data class ListContext(val listProperty: String, val listIndex: Int)

data class ListValue(
    val value: List<Map<String, Any?>>,
    val property: String
)

data class FormumatValues(
    val data: Map<String, Any>,
    val types: Map<String, Type>,
    val fields: Map<String, Field>,
    val dispatcher: Dispatcher,
    val listContext: ListContext? = null
) : MapDecorator<String, Any> {

    class Entry(override val key: String, override val value: Any) : Map.Entry<String, Any>

    override val entries: Set<Map.Entry<String, Any>>
        get() = types.keys.filter { key -> get(key) != null }.map { key -> Entry(key, get(key)!!) }.toSet()

    fun absoluteKey(key: String) = when {
        listContext != null -> "${listContext.listProperty}.$key"
        else -> key
    }

    fun getType(key: String) = types[absoluteKey(key)]

    @Suppress("UNCHECKED_CAST")
    override fun get(key: String): Any? {
        val value = when {
            listContext != null -> {
                val value =
                    (data[listContext.listProperty] as? List<Map<String, Any>>)?.get(listContext.listIndex)?.get(key)
                value ?: getType(key)?.default?.eval(this)
            }

            else -> data[key].orElse { types[key]?.default?.eval(this) }
        }
        val valOrListValue = if (value is List<*>) ListValue(value as List<Map<String, Any?>>, key) else value
        if (valOrListValue == null) {
            Logger.d { "Unable to find value with key \"${key}\"" }
        }
        return valOrListValue
    }

    fun getWithoutDefault(key: String): Any? {
        val value = when {
            listContext != null -> {
                (data[listContext.listProperty] as? List<Map<String, Any>>)?.get(listContext.listIndex)?.get(key)
            }

            else -> data[key]
        }
        val valOrListValue = if (value is List<*>) ListValue(value as List<Map<String, Any?>>, key) else value
        if (valOrListValue == null) {
            Logger.d { "Unable to find value with key \"${key}\"" }
        }
        return valOrListValue
    }

    fun getDefault(key: String): Any? {
        return when {
            listContext != null -> {
                getType(key)?.default?.eval(this)
            }

            else -> types[key]?.default?.eval(this)
        }
    }

    override val keys: Set<String>
        get() = data.keys
}

interface Evaluatable {
    fun eval(values: Map<String, Any> = emptyMap()): Any
}

@Serializable(with = BoolishSearializer::class)
sealed class Boolish : Evaluatable {
    override fun eval(values: Map<String, Any>) = false
    data class Literal(val value: Boolean) : Boolish() {
        override fun eval(values: Map<String, Any>) = value
    }

    data class Expression(val value: String) : Boolish() {
        override fun eval(values: Map<String, Any>) = try {
            evaluator.evaluateBoolean(value, values)
        } catch (e: Throwable) {
            Logger.d { "Unable to evaluate: ${e.message} in \"${value}\"" }
            false
        }
    }
}

object BoolishSearializer : KSerializer<Boolish> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Boolish", PrimitiveKind.STRING)

    @OptIn(ExperimentalSerializationApi::class)
    override fun serialize(encoder: Encoder, value: Boolish) {
        when (value) {
            is Boolish.Literal -> encoder.encodeNullableSerializableValue(
                Boolean.serializer(),
                value.value
            )

            is Boolish.Expression -> encoder.encodeNullableSerializableValue(
                String.serializer(),
                value.value
            )
        }
    }

    override fun deserialize(decoder: Decoder): Boolish {
        val element = decoder.decodeSerializableValue(JsonElement.serializer())
        return when {
            element is JsonPrimitive && element.isString -> Boolish.Expression(element.content)
            element is JsonPrimitive && element.booleanOrNull != null -> Boolish.Literal(element.boolean)
            else -> Boolish.Literal(false)
        }
    }
}

data class StringishTranslations(val translations: Map<String, Stringish>) : Map<String, Stringish> by translations {
    fun getTranslation(): Stringish {
        return translations.get(Locale.current.language) ?: translations.get("__") ?:  translations.get("_") ?: Stringish.Literal("")
    }
}

@Serializable(with = StringishSearializer::class)
sealed class Stringish : Evaluatable {
    override fun eval(values: Map<String, Any>) = ""

    data class Literal(val value: String) : Stringish() {
        override fun eval(values: Map<String, Any>) = value

        override fun toString() = value
    }

    data class Expression(val value: String) : Stringish() {
        override fun eval(values: Map<String, Any>): String {
            return value.replace(Regex("<%=(.*?)%>")) {
                try {
                    evaluator.evaluateString(it.groups[1]?.value ?: "", values)
                } catch (e: Throwable) {
                    Logger.d { "Unable to evaluate: ${e.message} in \"${value}\"" }
                    ""
                }
            }
        }

        override fun toString() = value
    }

    data class Translations(val value: StringishTranslations) : Stringish() {
        override fun eval(values: Map<String, Any>) = value.getTranslation().eval(values)

        override fun toString() = value.getTranslation().toString()
    }
}

object StringishSearializer : KSerializer<Stringish> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Stringish", PrimitiveKind.STRING)

    @OptIn(ExperimentalSerializationApi::class)
    override fun serialize(encoder: Encoder, value: Stringish) {
        when (value) {
            is Stringish.Literal -> encoder.encodeNullableSerializableValue(
                String.serializer(),
                value.value
            )

            is Stringish.Expression -> encoder.encodeNullableSerializableValue(
                String.serializer(),
                value.value
            )

            is Stringish.Translations -> {
                val composite = encoder.beginStructure(descriptor)
                value.value.translations.onEachIndexed { index, translation ->
                    composite.encodeSerializableElement(
                        descriptor, index,
                        MapEntrySerializer(String.serializer(), StringishSearializer),
                        translation
                    )
                }
                composite.endStructure(descriptor)
            }
        }
    }

    override fun deserialize(decoder: Decoder): Stringish {
        val element = decoder.decodeSerializableValue(JsonElement.serializer())
        return when {
            element is JsonObject -> {
                Stringish.Translations(StringishTranslations(element.mapValues { deserializePrimitiveStringish(it.value) }))
            }

            else -> deserializePrimitiveStringish(element)
        }
    }

    private fun deserializePrimitiveStringish(element: Any): Stringish {
        return when {
            element is JsonPrimitive && element.isString -> when {
                element.content.contains(Regex("<%=(.*?)%>")) -> Stringish.Expression(element.content)
                else -> Stringish.Literal(element.content)
            }

            else -> Stringish.Literal("")
        }
    }
}

@Serializable(with = IntishSearializer::class)
sealed class Intish : Evaluatable {
    override fun eval(values: Map<String, Any>) = 0
    data class Literal(val value: Int) : Intish() {
        override fun eval(values: Map<String, Any>) = value
    }

    data class Expression(val value: String) : Intish() {
        override fun eval(values: Map<String, Any>) = try {
            evaluator.evaluateDouble(value, values).toInt()
        } catch (e: Throwable) {
            Logger.d { "Unable to evaluate: ${e.message} in \"${value}\"" }
            0
        }
    }
}

object IntishSearializer : KSerializer<Intish> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Intish", PrimitiveKind.STRING)

    @OptIn(ExperimentalSerializationApi::class)
    override fun serialize(encoder: Encoder, value: Intish) {
        when (value) {
            is Intish.Literal -> encoder.encodeNullableSerializableValue(
                Int.serializer(),
                value.value
            )

            is Intish.Expression -> encoder.encodeNullableSerializableValue(
                String.serializer(),
                value.value
            )
        }
    }

    override fun deserialize(decoder: Decoder): Intish {
        val element = decoder.decodeSerializableValue(JsonElement.serializer())
        return when {
            element is JsonPrimitive && element.isString -> Intish.Expression(element.content)
            element is JsonPrimitive && element.intOrNull != null -> Intish.Literal(element.int)
            else -> Intish.Literal(0)
        }
    }
}

@Serializable(with = NumberishSearializer::class)
sealed class Numberish : Evaluatable {
    override fun eval(values: Map<String, Any>) = 0.0
    data class Literal(val value: Double) : Numberish() {
        override fun eval(values: Map<String, Any>) = value
    }

    data class Expression(val value: String) : Numberish() {
        override fun eval(values: Map<String, Any>) = try {
            evaluator.evaluateDouble(value, values)
        } catch (e: Throwable) {
            Logger.d { "Unable to evaluate: ${e.message} in \"${value}\"" }
            0.0
        }
    }
}

object NumberishSearializer : KSerializer<Numberish> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Numberish", PrimitiveKind.STRING)

    @OptIn(ExperimentalSerializationApi::class)
    override fun serialize(encoder: Encoder, value: Numberish) {
        when (value) {
            is Numberish.Literal -> encoder.encodeNullableSerializableValue(
                Double.serializer(),
                value.value
            )

            is Numberish.Expression -> encoder.encodeNullableSerializableValue(
                String.serializer(),
                value.value
            )
        }
    }

    override fun deserialize(decoder: Decoder): Numberish {
        val element = decoder.decodeSerializableValue(JsonElement.serializer())
        return when {
            element is JsonPrimitive && element.isString -> Numberish.Expression(element.content)
            element is JsonPrimitive && element.doubleOrNull != null -> Numberish.Literal(element.double)
            else -> Numberish.Literal(0.0)
        }
    }
}
