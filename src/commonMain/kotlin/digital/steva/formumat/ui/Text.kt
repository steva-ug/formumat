package digital.steva.formumat.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Emergency
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.redux.SetValue
import digital.steva.formumat.schema.LabelField
import digital.steva.formumat.schema.LabelStyle
import digital.steva.formumat.schema.StringType
import digital.steva.formumat.schema.TextField

@Composable
fun LabelView(
    labelField: LabelField,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    Text(
        text = labelField.title.eval(values),
        style = when (labelField.style) {
            LabelStyle.HEADING -> MaterialTheme.typography.headlineLarge
            LabelStyle.TITLE -> MaterialTheme.typography.headlineMedium
            else -> MaterialTheme.typography.labelMedium
        },
        modifier = modifier.padding(vertical = 4.dp)
    )
}

@Composable
fun TextView(
    textField: TextField,
    stringType: StringType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val value = (values[textField.property?.eval(values)] ?: "").toString()
    val label = textField.title.eval(values)
    val fieldEnabled = enabled && textField.enabled.eval(values)
    val required = textField.isRequired(stringType, values)
    if (textField.multiline) {
        TextAreaView(textField, values, value, label, fieldEnabled, required, dispatch, modifier)
    } else {
        TextFieldView(textField, values, value, label, fieldEnabled, required, dispatch, modifier)
    }
}

@Composable
fun TextFieldView(
    textField: TextField,
    values: FormumatValues,
    value: String,
    label: String,
    enabled: Boolean,
    required: Boolean,
    dispatch: Dispatcher,
    modifier: Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = { dispatch(SetValue(textField.property?.eval(values) ?: "", it, values.listContext)) },
        label = { Text(label) },
        singleLine = true,
        enabled = enabled,
        trailingIcon = { RequiredIcon(required, value, enabled) },
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun TextAreaView(
    textField: TextField,
    values: FormumatValues,
    value: String,
    label: String,
    enabled: Boolean,
    required: Boolean,
    dispatch: Dispatcher,
    modifier: Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = { dispatch(SetValue(textField.property?.eval(values) ?: "", it, values.listContext)) },
        label = { Text(label) },
        singleLine = false,
        minLines = 5,
        maxLines = Int.MAX_VALUE,
        enabled = enabled,
        trailingIcon = { RequiredIcon(required, value, enabled) },
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun RequiredIcon(
    required: Boolean,
    value: String?,
    enabled: Boolean
) {
    if (required) {
        if (value.isNullOrBlank()) {
            Icon(
                Icons.Filled.Emergency,
                contentDescription = "",
                tint = if (enabled) Color(0xFFF06292) else Color(0xFFFFEBEE),
                modifier = Modifier.size(MaterialTheme.typography.bodyLarge.fontSize.value.dp)
            )
        } else {
            Icon(
                Icons.Filled.Check,
                contentDescription = "",
                tint = if (enabled) Color(0xFF81C784) else Color(0xFFC8E6C9),
                modifier = Modifier.size(MaterialTheme.typography.bodyLarge.fontSize.value.dp)
            )
        }
    }
}
