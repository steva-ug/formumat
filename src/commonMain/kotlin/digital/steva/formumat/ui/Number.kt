package digital.steva.formumat.ui

import LocaleSymbols
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.unit.dp
import digital.steva.formumat.redux.ClearValue
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.redux.SetValue
import digital.steva.formumat.schema.IntegerField
import digital.steva.formumat.schema.IntegerType
import digital.steva.formumat.schema.NumberField
import digital.steva.formumat.schema.NumberType
import digital.steva.formumat.schema.SliderField
import visualTransformToPlaceholderIfEmpty

@Suppress("UNUSED_PARAMETER")
@Composable
fun IntegerView(
    integerField: IntegerField,
    integerType: IntegerType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val property = integerField.property?.eval(values) ?: ""
    val label = integerField.title.eval(values)
    val fieldEnabled = enabled && integerField.enabled.eval(values)
    var onlyMinus by remember { mutableStateOf(false) }
    val defaultValue = values.getDefault(property)
    val valueString = if (onlyMinus) "-" else values.getWithoutDefault(property)?.toString() ?: ""
    val defaultValueString = defaultValue?.toString() ?: ""

    OutlinedTextField(
        value = valueString,
        onValueChange = {
            if (it.isBlank()) {
                dispatch(ClearValue(property, values.listContext))
                onlyMinus = false
            } else {
                val text = it
                onlyMinus = text == "-"
                text.toIntOrNull()?.let { value -> dispatch(SetValue(property, value, values.listContext)) }
            }
        },
        visualTransformation = visualTransformToPlaceholderIfEmpty(valueString, defaultValueString, MaterialTheme.colorScheme.tertiary),
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
        label = { Text(label) },
        singleLine = true,
        enabled = fieldEnabled,
        modifier = modifier.fillMaxWidth()
    )
}

@Suppress("UNUSED_PARAMETER")
@Composable
fun SliderView(
    sliderField: SliderField,
    integerType: IntegerType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val value = values[sliderField.property?.eval(values)]
    val label = sliderField.title.eval(values)
    val fieldEnabled = enabled && sliderField.enabled.eval(values)

    Column(
        modifier = modifier
    ) {
        if (!label.isNullOrBlank()) {
            Text(
                text = label,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }

        Slider(
            value = ((value as? Int) ?: (value as? Double))?.toFloat() ?: 0f,
            onValueChange = {
                dispatch(
                    SetValue(
                        sliderField.property?.eval(values) ?: "",
                        it.toInt(),
                        values.listContext
                    )
                )
            },
            enabled = fieldEnabled,
            valueRange = sliderField.min.toFloat()..sliderField.max.toFloat()
        )
    }
}

@Suppress("UNUSED_PARAMETER")
@Composable
fun NumberView(
    numberField: NumberField,
    numberType: NumberType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean,
    modifier: Modifier
) {
    fun formatValue(value: Any?, decimalSeparator: Char): String {
        if (value !is Double) return ""
        val intValue = value.toInt()
        if (intValue.toDouble() == value) return intValue.toString()
        return value.toString().replace('.', decimalSeparator)
    }

    val decimalSeparator = LocaleSymbols.ofLanguage(Locale.current.language).decimalSeparator
    val property = numberField.property?.eval(values) ?: ""
    val label = numberField.title.eval(values)
    val fieldEnabled = enabled && numberField.enabled.eval(values)
    var onlyMinus by remember { mutableStateOf(false) }
    var endsWithDot by remember { mutableStateOf(false) }
    var trailingDezimalZeroes by remember { mutableStateOf(0) }
    val defaultValue = values.getDefault(property)
    val valueString = (if (onlyMinus) "-" else formatValue(values.getWithoutDefault(property), decimalSeparator)) +
            (if (endsWithDot) decimalSeparator else "") +
            ("0".repeat(trailingDezimalZeroes))
    val defaultValueString = defaultValue?.toString() ?: ""

    OutlinedTextField(
        value = valueString,
        onValueChange = {
            if (it.isBlank()) {
                dispatch(ClearValue(property, values.listContext))
                onlyMinus = false
                endsWithDot = false
                trailingDezimalZeroes = 0
            } else {
                val text = it.replace(decimalSeparator, '.')
                onlyMinus = text == "-"
                endsWithDot = Regex("^[^.]*?\\.+0*$").matches(text)
                trailingDezimalZeroes = Regex("^.*?\\..*?(0*)$").find(text)?.groupValues?.get(1)?.length ?: 0
                println(text)
                text.toDoubleOrNull()?.let { dispatch(SetValue(property, it, values.listContext)) }
            }
        },
        visualTransformation = visualTransformToPlaceholderIfEmpty(valueString, defaultValueString, MaterialTheme.colorScheme.tertiary),
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal),
        label = { Text(label) },
        singleLine = true,
        enabled = fieldEnabled,
        modifier = modifier.fillMaxWidth()
    )
}
