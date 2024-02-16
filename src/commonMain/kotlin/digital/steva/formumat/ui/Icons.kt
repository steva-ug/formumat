package digital.steva.formumat.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
expect fun IconByName(
    name: String,
    color: Color = Color.Companion.Unspecified,
    modifier: Modifier = Modifier
)
