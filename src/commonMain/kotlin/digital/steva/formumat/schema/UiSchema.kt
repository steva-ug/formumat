package digital.steva.formumat.schema

import digital.steva.formumat.FormumatConfig
import digital.steva.formumat.helpers.flattenStringKeyMap
import digital.steva.formumat.redux.Boolish
import digital.steva.formumat.redux.Stringish
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.Polymorphic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

@Serializable
@SerialName("uiSchema")
data class UiSchema(
    val id: String? = null,
    val title: String? = null,
    val description: String? = null,
    val items: List<Field> = emptyList(),
    @Transient val fieldsByKey: Map<String, Field> = emptyMap(),
)

@Polymorphic
interface Field {
    val title: Stringish
    val property: String?
    val name: String?
    val visible: Boolish
    val enabled: Boolish
    val required: Boolish
    val clearable: Boolish
    fun isRequired(type: Type?, values: Map<String, Any>): Boolean = false
    fun isMissingRequired(type: Type?, values: Map<String, Any>): Boolean = false
    fun countRequired(types: Map<String, Type>, values: Map<String, Any>): Int = 0
    fun countMissingRequired(types: Map<String, Type>, values: Map<String, Any>): Int = 0
}

enum class LabelStyle {
    @SerialName("normal")
    NORMAL,

    @SerialName("heading")
    HEADING,

    @SerialName("title")
    TITLE,
}

@Serializable
@SerialName("label")
data class LabelField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val style: LabelStyle = LabelStyle.NORMAL,
) : Field

@Serializable
@SerialName("text")
data class TextField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val multiline: Boolean = false,
) : Field {
    override fun isRequired(type: Type?, values: Map<String, Any>): Boolean {
        return (type as? StringType)?.required == true || required.eval(values)
    }

    override fun isMissingRequired(type: Type?, values: Map<String, Any>): Boolean {
        val value = values[property] as? String
        return isRequired(type, values)
                && (value.isNullOrBlank() || Stringish.Expression(value).eval(values).isBlank())
    }

    override fun countRequired(types: Map<String, Type>, values: Map<String, Any>) =
        if (isRequired(types[property], values)) 1 else 0

    override fun countMissingRequired(types: Map<String, Type>, values: Map<String, Any>) =
        if (isMissingRequired(types[property], values)) 1 else 0
}

@Polymorphic
@Serializable
abstract class ToggleField(
    @Transient override val title: Stringish = Stringish.Literal(""),
    @Transient override val property: String? = null,
    @Transient override val name: String? = null,
    @Transient override val visible: Boolish = Boolish.Literal(true),
    @Transient override val enabled: Boolish = Boolish.Literal(true),
    @Transient override val required: Boolish = Boolish.Literal(true),
    @Transient override val clearable: Boolish = Boolish.Literal(true),
) : Field

@Serializable
@SerialName("checkbox")
data class CheckboxField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
) : ToggleField(title, property, name, visible, enabled, required, clearable)

@Serializable
@SerialName("switch")
data class SwitchField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
) : ToggleField(title, property, name, visible, enabled, required, clearable)

@Polymorphic
@Serializable
abstract class OptionsField(
    @Transient override val title: Stringish = Stringish.Literal(""),
    @Transient override val property: String? = null,
    @Transient override val name: String? = null,
    @Transient override val visible: Boolish = Boolish.Literal(true),
    @Transient override val enabled: Boolish = Boolish.Literal(true),
    @Transient override val required: Boolish = Boolish.Literal(true),
    @Transient override val clearable: Boolish = Boolish.Literal(true),
    @Transient open val enumLabels: Map<String, String> = emptyMap(),
) : Field

@Serializable
@SerialName("radios")
data class RadiosField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    override val enumLabels: Map<String, String> = emptyMap(),
) : OptionsField(title, property, name, visible, enabled, required, clearable, enumLabels)

@Serializable
@SerialName("dropdown")
data class DropdownField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    override val enumLabels: Map<String, String> = emptyMap(),
    val emptyOption: Boolish = Boolish.Literal(true),
) : OptionsField(title, property, name, visible, enabled, required, clearable, enumLabels)

@Serializable
@SerialName("datetime")
data class DateTimeField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
) : Field

@Serializable
@SerialName("integer")
data class IntegerField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
) : Field

enum class NumberFormat(val serialName: String) {
    @SerialName("integer")
    INTEGER("integer"),

    @SerialName("decimal")
    DECIMAL("decimal")
}

@Serializable
@SerialName("number")
data class NumberField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val format: String = NumberFormat.DECIMAL.serialName
) : Field

@Serializable
@SerialName("slider")
data class SliderField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val min: Int = 0,
    val max: Int = 100,
) : Field

@Serializable
@SerialName("button")
data class ButtonField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val icon: String? = null,
    val onClick: List<String> = emptyList(),
) : Field

@Serializable
@SerialName("page")
data class Page(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val icon: String? = null,
    val items: List<Field> = emptyList(),
) : Field {
    override fun countRequired(types: Map<String, Type>, values: Map<String, Any>) =
        items.sumOf { it.countRequired(types, values) }

    override fun countMissingRequired(types: Map<String, Type>, values: Map<String, Any>) =
        items.sumOf { it.countMissingRequired(types, values) }
}

@Serializable
@SerialName("section")
data class Section(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val icon: String? = null,
    val items: List<Field> = emptyList(),
) : Field {

    override fun countRequired(types: Map<String, Type>, values: Map<String, Any>) =
        items.sumOf { it.countRequired(types, values) }

    override fun countMissingRequired(types: Map<String, Type>, values: Map<String, Any>) =
        items.sumOf { it.countMissingRequired(types, values) }
}

@Serializable
@SerialName("row")
data class RowField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val items: List<Field> = emptyList(),
) : Field

@Serializable
@SerialName("list")
data class ListField(
    override val title: Stringish = Stringish.Literal(""),
    override val property: String? = null,
    override val name: String? = null,
    override val visible: Boolish = Boolish.Literal(true),
    override val enabled: Boolish = Boolish.Literal(true),
    override val required: Boolish = Boolish.Literal(false),
    override val clearable: Boolish = Boolish.Literal(true),
    val items: List<Field> = emptyList(),
) : Field

@OptIn(InternalSerializationApi::class)
fun parseUiSchema(json: String): UiSchema {
    val parser = Json {
        serializersModule = SerializersModule {
            polymorphic(Field::class) {
                subclass(LabelField::class, LabelField.serializer())
                subclass(TextField::class, TextField.serializer())
                subclass(CheckboxField::class, CheckboxField.serializer())
                subclass(SwitchField::class, SwitchField.serializer())
                subclass(RadiosField::class, RadiosField.serializer())
                subclass(DropdownField::class, DropdownField.serializer())
                subclass(DateTimeField::class, DateTimeField.serializer())
                subclass(IntegerField::class, IntegerField.serializer())
                subclass(SliderField::class, SliderField.serializer())
                subclass(NumberField::class, NumberField.serializer())
                subclass(ButtonField::class, ButtonField.serializer())
                subclass(Page::class, Page.serializer())
                subclass(Section::class, Section.serializer())
                subclass(RowField::class, RowField.serializer())
                subclass(ListField::class, ListField.serializer())
                FormumatConfig.fields.forEach { it(this) }
            }
        }
        ignoreUnknownKeys = true
    }

    val uiSchema: UiSchema = parser.decodeFromString(json)

    fun convertFieldListToFieldMap(fields: List<Field>) =
        fields.filter { it.name != null }.associateBy { it.name!! }

    return uiSchema.copy(
        fieldsByKey = flattenStringKeyMap(
            convertFieldListToFieldMap(uiSchema.items),
            { it is Page || it is Section || it is ListField },
            {
                when (it) {
                    is Page -> convertFieldListToFieldMap(it.items)
                    is Section -> convertFieldListToFieldMap(it.items)
                    is ListField -> convertFieldListToFieldMap(it.items)
                    else -> emptyMap()
                }
            },
            addContainers = true
        )
    )
}
