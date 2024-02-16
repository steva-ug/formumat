package digital.steva.formumat.redux

import com.github.murzagalin.evaluator.Function
import digital.steva.formumat.helpers.Convert
import digital.steva.formumat.schema.EnumerableType
import digital.steva.formumat.schema.OptionsField

object Functions {
    val Nz = object : Function("Nz", 1..2) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 2) { "$name should be called with exactly 2 arguments" }
            val value = args[0]
            val default = args[1]
            return when (value) {
                is List<*> -> value.map { it ?: default }
                else -> value ?: default
            }
        }
    }

    val ToStr = object : Function("ToStr", 1) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 1) { "$name should be called with exactly 1 argument" }
            return Convert.toString(args[0])
        }
    }

    val ToBool = object : Function("ToBool", 1) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 1) { "$name should be called with exactly 1 argument" }
            return Convert.toBoolean(args[0])
        }
    }

    val ToInt = object : Function("ToInt", 1) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 1) { "$name should be called with exactly 1 argument" }
            return Convert.toInt(args[0])
        }
    }

    val ToDouble = object : Function("ToDouble", 1) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 1) { "$name should be called with exactly 1 argument" }
            return Convert.toDouble(args[0])
        }
    }

    val Len = object : Function("Len", 1) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 1) { "$name should be called with exactly 1 argument" }
            val arg = args[0]
            return (arg as? Iterable<*>)?.count() ?: Convert.toString(arg).length
        }
    }

    val Join = object : Function("Join", 1..Int.MAX_VALUE) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.isNotEmpty()) { "$name should be called with at least 1 argument" }
            val separator = Convert.toString(args[0])
            return args.drop(1).filterNotNull().joinToString(separator)
        }
    }

    val ListValues = object : Function("ListValues", 2) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 2) { "$name should be called with exactly 2 arguments" }
            val formuatValues = values as FormumatValues
            val listValue = args[0] as? ListValue
            val property = args[1].toString()
            return listValue?.value?.mapIndexed { index, row ->
                row[property] ?: formuatValues.getType("${listValue.property}.$property")?.default
                    ?.eval(formuatValues.copy(listContext = ListContext(listValue.property, index)))
            } ?: emptyList<Any>()
        }
    }

    val EnumValue = object : Function("EnumValue", 2) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 2) { "$name should be called with exactly 2 argument" }
            val formumatValues = values as FormumatValues
            val property = Convert.toString(args[0])
            val value = args[1]
            val enumType = formumatValues.getType(property) as? EnumerableType
            return enumType?.getValue(value) ?: 0
        }
    }

    val OptionsLabel = object : Function("OptionsLabel", 2) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            require(args.size == 2) { "$name should be called with exactly 2 argument" }
            val formumatValues = values as FormumatValues
            val optionsField = formumatValues.fields[Convert.toString(args[0])] as? OptionsField
            val value = Convert.toInt(args[1])
            return optionsField?.let { field ->
                val enums = (formumatValues.getType(field.property?.eval(values) ?: "") as? EnumerableType)?.enum ?: emptyList()
                val enum = if (value > 0 && value <= enums.size) enums[value - 1].toString() else ""
                field.enumLabels[enum] ?: ""
            } ?: ""
        }
    }

    val Dispatch = object : Function("Dispatch", 1..Int.MAX_VALUE) {
        override fun invoke(values: Map<String, Any?>, vararg args: Any?): Any? {
            @Suppress("UNCHECKED_CAST")
            require(args.isNotEmpty()) { "$name should be called with at least 1 argument" }
            val formumatValues = values as FormumatValues
            formumatValues.dispatcher.invoke(
                createAction(
                    args[0].toString(),
                    *(args.drop(1).filterNotNull().toTypedArray())
                )
            )
            return Unit
        }
    }

    val ALL = listOf(Nz, ToStr, ToBool, ToInt, ToDouble, Len, Join, ListValues, EnumValue, OptionsLabel, Dispatch)
}
