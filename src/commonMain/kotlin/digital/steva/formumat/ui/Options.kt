package digital.steva.formumat.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import digital.steva.formumat.helpers.Convert
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.redux.SetValue
import digital.steva.formumat.schema.BooleanType
import digital.steva.formumat.schema.CheckboxField
import digital.steva.formumat.schema.DropdownField
import digital.steva.formumat.schema.EnumerableType
import digital.steva.formumat.schema.RadiosField
import digital.steva.formumat.schema.SwitchField

@Suppress("UNUSED_PARAMETER")
@Composable
fun CheckboxView(
    checkboxField: CheckboxField,
    checkboxType: BooleanType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val checked = (values[checkboxField.property?.eval(values)] ?: false) as Boolean
    val label = checkboxField.title.eval(values)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clip(MaterialTheme.shapes.small)
            .clickable(
                onClick = {
                    dispatch(
                        SetValue(
                            checkboxField.property?.eval(values) ?: "",
                            !checked,
                            values.listContext
                        )
                    )
                }
            )
            .padding(4.dp)
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = null
        )
        Spacer(Modifier.size(6.dp))
        Text(
            text = label,
        )
    }
}

@Suppress("UNUSED_PARAMETER")
@Composable
fun SwitchView(
    switchField: SwitchField,
    switchType: BooleanType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val checked = (values[switchField.property?.eval(values)] ?: false) as Boolean
    val label = switchField.title.eval(values)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clip(MaterialTheme.shapes.small)
            .clickable(
                onClick = {
                    dispatch(
                        SetValue(
                            switchField.property?.eval(values) ?: "",
                            !checked,
                            values.listContext
                        )
                    )
                }
            )
            .padding(4.dp)
    ) {
        Switch(
            checked = checked,
            onCheckedChange = null
        )
        Spacer(Modifier.size(6.dp))
        Text(
            text = label
        )
    }
}

@Suppress("UNUSED_PARAMETER")
@Composable
fun RadiosView(
    radiosField: RadiosField,
    enumerableType: EnumerableType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val value = values[radiosField.property?.eval(values)]
    val valueKey = radiosField.property?.eval(values) ?: ""
    val label = radiosField.title.eval(values)
    val options = enumerableType?.enum
    val optionLabels = radiosField.enumLabels

    Column(
        modifier = modifier
    ) {
        if (!label.isNullOrBlank()) {
            Text(
                text = label,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
        options?.forEach { option ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                RadioButton(
                    selected = option == value,
                    onClick = {
                        dispatch(
                            SetValue(
                                valueKey,
                                if (option != value) option else 0,
                                values.listContext
                            )
                        )
                    },
                    modifier = Modifier.size(36.dp)
                )
                Text(
                    text = optionLabels.get(option.toString()) ?: option.toString()
                )
            }
        }
    }
}

@Suppress("UNUSED_PARAMETER")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownView(
    dropdownField: DropdownField,
    enumerableType: EnumerableType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val valueKey = dropdownField.property?.eval(values) ?: ""
    val label = dropdownField.title.eval(values)
    val options = enumerableType?.enum
    val optionLabels = dropdownField.enumLabels
    val value = values[dropdownField.property?.eval(values)]?.let {
        when {
            it != "" && it != 0 && it != 0.0 -> Convert.toString(it).let { index -> optionLabels[index] ?: index }
            else -> null
        }
    } ?: ""

    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
    ) {
        if (!label.isNullOrBlank()) {
            Text(
                text = label,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
        ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = !expanded }) {
            TextField(
                value = Convert.toString(value).let { optionLabels[it] ?: it },
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                modifier = Modifier.menuAnchor().fillMaxWidth()
            )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                if (dropdownField.emptyOption.eval(values)) {
                    DropdownMenuItem(
                        text = { Text("") },
                        onClick = {
                            dispatch(SetValue(valueKey, 0, values.listContext))
                            expanded = false
                        }
                    )
                }
                options?.forEach { option ->
                    DropdownMenuItem(
                        text = { Text(Convert.toString(option).let { optionLabels[it] ?: it }) },
                        onClick = {
                            dispatch(
                                SetValue(
                                    valueKey,
                                    option,
                                    values.listContext
                                )
                            )
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}
