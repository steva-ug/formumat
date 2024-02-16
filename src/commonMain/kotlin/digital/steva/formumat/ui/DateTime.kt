package digital.steva.formumat.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.schema.DateTimeField
import digital.steva.formumat.schema.StringType

@Composable
expect fun DateTimeView(
    dateTimeField: DateTimeField,
    type: StringType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)
