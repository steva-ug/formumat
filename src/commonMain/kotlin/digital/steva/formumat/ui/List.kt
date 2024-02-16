package digital.steva.formumat.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.schema.ArrayType
import digital.steva.formumat.schema.ListField
import digital.steva.formumat.schema.Type

@Composable
expect fun ListView(
    listField: ListField,
    arrayType: ArrayType?,
    types: Map<String, Type>,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)
