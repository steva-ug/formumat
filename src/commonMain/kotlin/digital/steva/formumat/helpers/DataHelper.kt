package digital.steva.formumat.helpers

import kotlinx.collections.immutable.persistentMapOf

interface MapDecorator<K, V> : Map<K, V> {
    override val entries: Set<Map.Entry<K, V>>
        get() = TODO("Not yet implemented: entries")
    override val keys: Set<K>
        get() = TODO("Not yet implemented: keys")
    override val size: Int
        get() = TODO("Not yet implemented: size")
    override val values: Collection<V>
        get() = TODO("Not yet implemented: values")

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented: isEmpty")
    }

    override fun containsValue(value: V): Boolean {
        TODO("Not yet implemented: containsValue")
    }

    override fun containsKey(key: K): Boolean {
        TODO("Not yet implemented: containesKey")
    }
}

object Convert {
    fun toBoolean(value: Any?) = when (value) {
        null -> false
        is Boolean -> value
        is Int -> value != 0
        is Double -> value != 0
        "true" -> true
        "on" -> true
        else -> false
    }

    fun toInt(value: Any?) = when (value) {
        null -> 0
        is Int -> value
        is Double -> value.toInt()
        else -> value.toString().toIntOrNull() ?: 0
    }

    fun toDouble(value: Any?) = when (value) {
        null -> 0.0
        is Double -> value
        is Int -> value.toDouble()
        else -> value.toString().toDoubleOrNull() ?: 0.0
    }

    fun toString(value: Any?) = when (value) {
        null -> ""
        is String -> value
        else -> value.toString()
    }
}

fun <V> flattenStringKeyMap(
    nestedMap: Map<String, V>,
    valueIsContainer: (V) -> Boolean,
    extractContainerMap: (V) -> Map<String, V>,
    prefix: String = "",
    addContainers: Boolean
): Map<String, V> {
    return nestedMap.entries.fold(persistentMapOf()) { acc, (key, value) ->
        val newKey = if (prefix.isEmpty()) key else "${prefix}.${key}"
        when {
            valueIsContainer(value) -> {
                (if (addContainers) acc.put(newKey, value) else acc)
                    .putAll(
                        flattenStringKeyMap(
                            extractContainerMap(value),
                            valueIsContainer,
                            extractContainerMap,
                            newKey,
                            addContainers
                        )
                    )
            }

            else -> acc.put(newKey, value)
        }
    }
}

fun convertToNestedStringKeyMap(flatMap: Map<String, Any>): Map<String, Any> {
    val nestedMap = mutableMapOf<String, Any>()

    flatMap.forEach { (flatKey, value) ->
        var currentLevel = nestedMap
        val keys = flatKey.split(".")
        keys.forEachIndexed { index, key ->
            if (index == keys.lastIndex) {
                currentLevel[key] = value
            } else {
                if (!currentLevel.containsKey(key)) {
                    currentLevel[key] = mutableMapOf<String, Any>()
                }
                @Suppress("UNCHECKED_CAST")
                currentLevel = currentLevel[key] as MutableMap<String, Any>
            }
        }
    }

    return nestedMap
}

fun <T> T?.orElse(f: () -> T): T = when (this) {
    null -> f()
    else -> this
}
