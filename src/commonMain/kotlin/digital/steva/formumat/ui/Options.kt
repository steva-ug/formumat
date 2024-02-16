package digital.steva.formumat.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.schema.BooleanType
import digital.steva.formumat.schema.CheckboxField
import digital.steva.formumat.schema.DropdownField
import digital.steva.formumat.schema.EnumerableType
import digital.steva.formumat.schema.RadiosField
import digital.steva.formumat.schema.SwitchField

@Composable
expect fun CheckboxView(
    checkboxField: CheckboxField,
    checkboxType: BooleanType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)

@Composable
expect fun SwitchView(
    switchField: SwitchField,
    switchType: BooleanType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)

@Composable
expect fun RadiosView(
    radiosField: RadiosField,
    enumerableType: EnumerableType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)

@Composable
expect fun DropdownView(
    dropdownField: DropdownField,
    enumerableType: EnumerableType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)
