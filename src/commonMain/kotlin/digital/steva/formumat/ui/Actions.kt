package digital.steva.formumat.ui

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.redux.evaluator
import digital.steva.formumat.schema.ButtonField

@Composable
fun ButtonView(
    buttonField: ButtonField,
    values: FormumatValues,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {
            buttonField.onClick.forEach { evaluator.evaluateString(it, values) }
        },
        enabled = enabled && buttonField.enabled.eval(values),
        modifier = modifier
    ) {
        buttonField.icon?.let {
            IconByName(
                name = it,
                color = if (enabled) MaterialTheme.colorScheme.onTertiary else Color.Gray
            )
        }
        Text(
            text = buttonField.title.eval(values),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
    }
}
