package digital.steva.formumat

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.murzagalin.evaluator.Function
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.schema.Field
import digital.steva.formumat.schema.Type
import kotlinx.serialization.modules.PolymorphicModuleBuilder

object FormumatConfig {
    val views: MutableList<@Composable (
        field: Field, type: Type?, types: Map<String, Type>,
        values: FormumatValues, dispatch: Dispatcher, enabled: Boolean, modifier: Modifier
    ) -> Unit> = mutableListOf()
    val fields: MutableList<(builder: PolymorphicModuleBuilder<Field>) -> Unit> = mutableListOf()
    val functions: MutableList<Function> = mutableListOf()
}
