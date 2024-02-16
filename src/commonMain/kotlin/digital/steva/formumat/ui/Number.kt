package digital.steva.formumat.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.schema.IntegerField
import digital.steva.formumat.schema.IntegerType
import digital.steva.formumat.schema.NumberField
import digital.steva.formumat.schema.NumberType
import digital.steva.formumat.schema.SliderField

@Composable
expect fun IntegerView(
    integerField: IntegerField,
    integerType: IntegerType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)

@Composable
expect fun SliderView(
    sliderField: SliderField,
    integerType: IntegerType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
)

@Composable
expect fun NumberView(
    numberField: NumberField,
    numberType: NumberType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean,
    modifier: Modifier
)
