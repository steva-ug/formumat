package digital.steva.formumat.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.schema.LabelField
import digital.steva.formumat.schema.StringType
import digital.steva.formumat.schema.TextField

@Composable
expect fun LabelView(
    textField: LabelField,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)

@Composable
expect fun TextView(
    textField: TextField,
    stringType: StringType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)
