package digital.steva.formumat.ui

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.redux.evaluator
import digital.steva.formumat.schema.ButtonField

@Composable
actual fun ButtonView(
    buttonField: ButtonField,
    values: FormumatValues,
    enabled: Boolean,
    modifier: Modifier
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
        Text(buttonField.title.eval(values))
    }
}
