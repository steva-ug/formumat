package digital.steva.formumat.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatState
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.schema.DataSchema
import digital.steva.formumat.schema.Field
import digital.steva.formumat.schema.Page
import digital.steva.formumat.schema.RowField
import digital.steva.formumat.schema.Type
import digital.steva.formumat.schema.UiSchema

@Composable
expect fun FormView(
    uiSchema: UiSchema,
    dataSchema: DataSchema,
    state: FormumatState,
    dispatch: Dispatcher
)

@Composable
expect fun Progress(
    pages: List<Page>,
    types: Map<String, Type>,
    values: FormumatValues
)

@Composable
expect fun PageNavigationView(
    fields: List<Field>,
    types: Map<String, Type>,
    values: FormumatValues,
    selectedPage: Page?,
    dispatch: Dispatcher,
    onPageSelected: (Page) -> Unit
)

@Composable
expect fun RowView(
    rowField: RowField,
    types: Map<String, Type>,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)
