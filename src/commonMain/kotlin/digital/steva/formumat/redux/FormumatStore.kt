package digital.steva.formumat.redux

import digital.steva.formumat.helpers.convertToNestedStringKeyMap
import digital.steva.formumat.helpers.flattenStringKeyMap
import digital.steva.formumat.schema.DataSchema
import digital.steva.formumat.schema.Page
import digital.steva.formumat.schema.UiSchema
import digital.steva.formumat.schema.parseDataSchema
import digital.steva.formumat.schema.parseUiSchema
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.PersistentMap
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf
import kotlinx.collections.immutable.toPersistentList
import kotlinx.collections.immutable.toPersistentMap
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.doubleOrNull
import kotlinx.serialization.json.intOrNull
import org.reduxkotlin.Store
import org.reduxkotlin.threadsafe.createThreadSafeStore

data class FormumatState(
    val dataSchema: DataSchema,
    val uiSchema: UiSchema,
    val data: PersistentMap<String, Any>,
    val currentPage: Page? = null,
)

open class FormumatAction
class NoOp : FormumatAction()
data class SetDataSchema(val dataSchema: DataSchema) : FormumatAction()
data class SetUiSchema(val uiSchema: UiSchema) : FormumatAction()
data class SetValues(val values: PersistentMap<String, Any>) : FormumatAction()
data class SetValue(val property: String, val value: Any?, val listContext: ListContext?) :
    FormumatAction()

data class ClearValue(val property: String, val listContext: ListContext?) : FormumatAction()
data class AddListRow(val listProperty: String) : FormumatAction()
data class RemoveListRow(val listProperty: String, val index: Int) : FormumatAction()
data class SetCurrentPage(val page: Page) : FormumatAction()

typealias Dispatcher = (Any) -> Unit

@Suppress("UNCHECKED_CAST")
private fun reducer(state: FormumatState, action: Any) =
    when (action) {
        is SetDataSchema -> state.copy(dataSchema = action.dataSchema)

        is SetUiSchema -> {
            state.copy(
                uiSchema = action.uiSchema,
                currentPage = action.uiSchema.fieldsByKey.values
                    .filterIsInstance<Page>()
                    .firstOrNull { it.name == state.currentPage?.name || it.title == state.currentPage?.title }
            )
        }

        is SetValues -> state.copy(data = action.values)

        is SetValue -> when (action.listContext) {
            null -> {
                val type = state.dataSchema.typesByKey[action.property]
                type?.let {
                    state.copy(data = state.data.put(action.property, type.convertToType(action.value)))
                } ?: state
            }

            else -> {
                val type = state.dataSchema.typesByKey["${action.listContext.listProperty}.${action.property}"]
                type?.let {
                    val list =
                        state.data[action.listContext.listProperty] as PersistentList<Map<String, Any>>
                    val entry = list[action.listContext.listIndex] as PersistentMap<String, Any>
                    val newEntry = entry.put(action.property, type.convertToType(action.value))
                    val newList = list.set(action.listContext.listIndex, newEntry)
                    state.copy(data = state.data.put(action.listContext.listProperty, newList))
                } ?: state
            }
        }

        is ClearValue -> when (action.listContext) {
            null -> state.copy(data = state.data.remove(action.property))
            else -> {
                val list =
                    state.data[action.listContext.listProperty] as PersistentList<Map<String, Any>>
                val entry = list[action.listContext.listIndex] as PersistentMap<String, Any>
                val newEntry = entry.remove(action.property)
                val newList = list.set(action.listContext.listIndex, newEntry)
                state.copy(data = state.data.put(action.listContext.listProperty, newList))
            }
        }

        is AddListRow -> state.copy(
            data = state.data.put(
                action.listProperty,
                (state.data[action.listProperty] as? PersistentList<Any> ?: persistentListOf()).add(
                    persistentMapOf<String, Any>()
                )
            )
        )

        is RemoveListRow -> state.copy(
            data = state.data.put(
                action.listProperty,
                (state.data[action.listProperty] as PersistentList<Any>).removeAt(action.index)
            )
        )

        is SetCurrentPage -> state.copy(currentPage = action.page)

        else -> state
    }

typealias FormumatStore = Store<FormumatState>

fun createFormumatState(
    dataSchema: DataSchema,
    uiSchema: UiSchema,
    values: Map<String, Any>,
) = FormumatState(dataSchema, uiSchema, values.toPersistentMap())

fun createFormumatState(
    dataSchema: String,
    uiSchema: String,
    values: String,
) = try {
    createFormumatState(parseDataSchema(dataSchema), parseUiSchema(uiSchema), parseValues(values))
} catch (e: Throwable) {
    createFormumatState(
        parseDataSchema("{\"properties\":{}}"),
        parseUiSchema("{\"items\":[{\"type\":\"label\",\"title\":${Json.encodeToString(e.message)}}]}"),
        parseValues("{}")
    )
}

fun createFormumatStore(
    dataSchema: DataSchema,
    uiSchema: UiSchema,
    values: Map<String, Any>,
) = createThreadSafeStore(
    ::reducer,
    createFormumatState(dataSchema, uiSchema, values.toPersistentMap())
)

fun createFormumatStore(
    dataSchema: String,
    uiSchema: String,
    values: String,
) = createThreadSafeStore(
    ::reducer,
    createFormumatState(dataSchema, uiSchema, values)
)

fun parseValues(json: String): PersistentMap<String, Any> {
    val parser = Json {
        coerceInputValues = true
    }

    fun decodeJsonToMap(json: String): Map<String, Any> {
        val map: Map<String, JsonElement> = parser.decodeFromString(json)
        return map.mapValues { (_, value) ->
            when (value) {
                is JsonObject -> decodeJsonToMap(value.toString())
                is JsonArray -> value.map { decodeJsonToMap(it.toString()) }.toPersistentList()
                is JsonPrimitive ->
                    (if (value.isString) value.content else null)
                        ?: value.booleanOrNull
                        ?: value.intOrNull
                        ?: value.doubleOrNull
                        ?: Unit
            }
        }.toPersistentMap()
    }

    return flattenStringKeyMap(decodeJsonToMap(json), { it is Map<*, *> }, {
        @Suppress("UNCHECKED_CAST")
        it as Map<String, Any>
    }, addContainers = false).toPersistentMap()
}

fun stringifyValues(values: Map<String, Any>) = convertToNestedStringKeyMap(values).toJsonElement().toString()

fun createAction(name: String, vararg args: Any): Any {
    return when (name) {
        "SetValue" -> SetValue(args[0].toString(), args[1], null)
        "ClearValue" -> ClearValue(args[0].toString(), null)
        else -> NoOp()
    }
}

fun Any?.toJsonElement(): JsonElement =
    when (this) {
        null -> JsonNull
        is Map<*, *> -> toJsonElement()
        is Collection<*> -> toJsonElement()
        is Boolean -> JsonPrimitive(this)
        is Number -> JsonPrimitive(this)
        is String -> JsonPrimitive(this)
        is Enum<*> -> JsonPrimitive(this.toString())
        else -> throw IllegalStateException("Can't serialize unknown type: $this")
    }

private fun Collection<*>.toJsonElement(): JsonElement {
    val list: MutableList<JsonElement> = mutableListOf()
    this.forEach { value ->
        when (value) {
            null -> list.add(JsonNull)
            is Map<*, *> -> list.add(value.toJsonElement())
            is Collection<*> -> list.add(value.toJsonElement())
            is Boolean -> list.add(JsonPrimitive(value))
            is Number -> list.add(JsonPrimitive(value))
            is String -> list.add(JsonPrimitive(value))
            is Enum<*> -> list.add(JsonPrimitive(value.toString()))
            else -> throw IllegalStateException("Can't serialize unknown collection type: $value")
        }
    }
    return JsonArray(list)
}

private fun Map<*, *>.toJsonElement(): JsonElement {
    val map: MutableMap<String, JsonElement> = mutableMapOf()
    this.forEach { (key, value) ->
        key as String
        when (value) {
            null -> map[key] = JsonNull
            is Map<*, *> -> map[key] = value.toJsonElement()
            is Collection<*> -> map[key] = value.toJsonElement()
            is Boolean -> map[key] = JsonPrimitive(value)
            is Number -> map[key] = JsonPrimitive(value)
            is String -> map[key] = JsonPrimitive(value)
            is Enum<*> -> map[key] = JsonPrimitive(value.toString())
            else -> throw IllegalStateException("Can't serialize unknown type: $value")
        }
    }
    return JsonObject(map)
}
