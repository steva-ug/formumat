package digital.steva.formumat.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.schema.ButtonField

@Composable
expect fun ButtonView(
    buttonField: ButtonField,
    values: FormumatValues,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)
