package digital.steva.formumat.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import digital.steva.formumat.redux.AddListRow
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.redux.ListContext
import digital.steva.formumat.redux.ListValue
import digital.steva.formumat.redux.RemoveListRow
import digital.steva.formumat.schema.ArrayType
import digital.steva.formumat.schema.ListField
import digital.steva.formumat.schema.Type

@Suppress("UNUSED_ANONYMOUS_PARAMETER")
@Composable
fun ListView(
    listField: ListField,
    arrayType: ArrayType?,
    types: Map<String, Type>,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val listProperty = listField.property?.eval(values) ?: ""
    Column(
        modifier.border(
            2.dp,
            SolidColor(MaterialTheme.colorScheme.secondaryContainer),
            shape = RoundedCornerShape(4.dp)
        ).padding(top = 4.dp, bottom = 4.dp)
    ) {
        @Suppress("UNCHECKED_CAST") val listValues =
            (values[listProperty] as? ListValue)?.value ?: emptyList()
        listValues.forEachIndexed { index, entryValues ->
            ListRemoveButton(listProperty, index, dispatch)
            listField.items.forEach { field ->
                FieldView(
                    field, types,
                    values.copy(listContext = ListContext(listProperty, index)),
                    dispatch, field.enabled.eval(values),
                    modifier = modifier.padding(start = 8.dp, end = 8.dp)
                )
            }
        }
        ListAddButton(listProperty, dispatch)
    }
}

@Composable
fun ListAddButton(listProperty: String, dispatch: Dispatcher) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        ListDivider(modifier = Modifier.weight(1.0f))
        Button(
            onClick = { dispatch(AddListRow(listProperty)) },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Icon(Icons.Filled.Add, "")
        }
        ListDivider(modifier = Modifier.width(8.dp))
    }
}

@Composable
fun ListRemoveButton(listProperty: String, index: Int, dispatch: Dispatcher) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        ListDivider(modifier = Modifier.weight(1.0f))
        Button(
            onClick = { dispatch(RemoveListRow(listProperty, index)) },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Icon(Icons.Filled.Remove, "")
        }
        ListDivider(modifier = Modifier.width(8.dp))
    }
}

@Composable
fun ListDivider(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .height(1.dp)
            .background(color = MaterialTheme.colorScheme.secondaryContainer)
    )
}
