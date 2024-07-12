package digital.steva.formumat.ui

import LocaleSettings
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimePicker
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import dev.icerock.moko.resources.compose.stringResource
import digital.steva.formumat.public.MR
import digital.steva.formumat.redux.ClearValue
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.redux.SetValue
import digital.steva.formumat.schema.DateTimeField
import digital.steva.formumat.schema.StringFormat
import digital.steva.formumat.schema.StringType
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format
import kotlinx.datetime.format.byUnicodePattern
import kotlinx.datetime.toLocalDateTime

@Composable
fun DateTimeView(
    dateTimeField: DateTimeField,
    type: StringType?,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val label = dateTimeField.title.eval(values)
    val value = values[dateTimeField.property?.eval(values)]
    val date = when (type?.format) {
        StringFormat.DATE_TIME -> value?.let { LocalDateTime.parse(it.toString()).date }
        StringFormat.DATE -> value?.let { LocalDate.parse(it.toString()) }
        else -> null
    }
    val time = when (type?.format) {
        StringFormat.DATE_TIME -> value?.let { LocalDateTime.parse(it.toString()).time }
        StringFormat.TIME -> value?.let { LocalTime.parse(it.toString()) }
        else -> null
    }

    Column(
        modifier = modifier
    ) {
        if (!label.isNullOrBlank()) {
            Text(
                text = label,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (type?.format == StringFormat.DATE_TIME || type?.format == StringFormat.DATE) {
                DateWithPickerDialog(
                    value = date
                ) {
                    val newValue = when (type.format) {
                        StringFormat.DATE_TIME -> LocalDateTime(it, time ?: LocalTime(0, 0, 0)).toString()
                        StringFormat.DATE -> it.toString()
                        else -> null
                    }
                    dispatch(SetValue(dateTimeField.property?.eval(values) ?: "", newValue, values.listContext))
                }
            }
            if (type?.format == StringFormat.DATE_TIME || type?.format == StringFormat.TIME) {
                TimeWithPickerDialog(
                    value = time
                ) {
                    val newValue = when (type.format) {
                        StringFormat.DATE_TIME -> LocalDateTime(date ?: LocalDate.fromEpochDays(0), it).toString()
                        StringFormat.TIME -> it.toString()
                        else -> null
                    }
                    dispatch(SetValue(dateTimeField.property?.eval(values) ?: "", newValue, values.listContext))
                }
            }
            if (dateTimeField.clearable.eval(values)) {
                Icon(
                    imageVector = Icons.Filled.Clear,
                    contentDescription = "",
                    tint = if (enabled) Color(0xFFF06292) else Color(0xFFFFEBEE),
                    modifier = Modifier
                        .height(16.dp)
                        .padding(start = 8.dp)
                        .drawBehind {
                            drawCircle(
                                color = if (enabled) Color(0xFFF06292) else Color(0xFFFFEBEE),
                                radius = 30f,
                                style = Stroke(width = 2.dp.toPx())
                            )
                        }
                        .clickable { dispatch(ClearValue(dateTimeField.property?.eval(values) ?: "", values.listContext)) }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DateWithPickerDialog(
    value: LocalDate?,
    onDatePicked: (date: LocalDate) -> Unit
) {
    val datePickerState = rememberDatePickerState()
    val showDialog = rememberSaveable { mutableStateOf(false) }
    if (showDialog.value) {
        DatePickerDialog(
            onDismissRequest = { showDialog.value = false },
            confirmButton = {
                TextButton(onClick = {
                    showDialog.value = false
                    datePickerState.selectedDateMillis?.let {
                        onDatePicked(Instant.fromEpochMilliseconds(it).toLocalDateTime(TimeZone.currentSystemDefault()).date)
                    }
                }) {
                    Text(text = stringResource(MR.strings.action_ok))
                }
            },
            dismissButton = {
                TextButton(onClick = { showDialog.value = false }) {
                    Text(text = stringResource(MR.strings.action_cancel))
                }
            }
        ) {
            DatePicker(state = datePickerState)
        }
    }

    OutlinedCard {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = value?.format(LocalDate.Format { byUnicodePattern(LocaleSettings.ofCurrentLanguage().dateFormatShort) }) ?: "",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(PaddingValues(top = 14.dp, bottom = 14.dp, start = 14.dp, end = 0.dp))
                    .clickable { showDialog.value = true }
                    .widthIn(min = 100.dp)
            )
            Icon(
                Icons.Filled.CalendarToday,
                tint = MaterialTheme.colorScheme.onSurface,
                contentDescription = "",
                modifier = Modifier
                    .clickable { showDialog.value = true }
                    .padding(end = 14.dp)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimeWithPickerDialog(
    value: LocalTime?,
    onTimePicked: (time: LocalTime) -> Unit
) {
    val timePickerState = rememberTimePickerState()
    val showDialog = rememberSaveable { mutableStateOf(false) }
    if (showDialog.value) {
        TimePickerDialog(
            onConfirm = {
                showDialog.value = false
                onTimePicked(LocalTime.fromSecondOfDay(timePickerState.hour * 3600 + timePickerState.minute * 60))
            },
            onCancel = { showDialog.value = false }
        ) {
            TimePicker(state = timePickerState)
        }
    }

    OutlinedCard {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = value?.format(LocalTime.Format { byUnicodePattern(LocaleSettings.ofCurrentLanguage().timeFormatShort) }) ?: "",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(PaddingValues(top = 14.dp, bottom = 14.dp, start = 14.dp, end = 0.dp))
                    .clickable { showDialog.value = true }
                    .widthIn(min = 50.dp)
            )
            Icon(
                Icons.Filled.AccessTime,
                tint = MaterialTheme.colorScheme.onSurface,
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 14.dp)
                    .clickable { showDialog.value = true }
            )
        }
    }
}

@Composable
fun TimePickerDialog(
    onCancel: () -> Unit,
    onConfirm: () -> Unit,
    toggle: @Composable () -> Unit = {},
    content: @Composable () -> Unit,
) {
    Dialog(
        onDismissRequest = onCancel,
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        ),
    ) {
        Surface(
            shape = MaterialTheme.shapes.extraLarge,
            tonalElevation = 6.dp,
            modifier = Modifier
                .width(IntrinsicSize.Min)
                .height(IntrinsicSize.Min)
                .background(
                    shape = MaterialTheme.shapes.extraLarge,
                    color = MaterialTheme.colorScheme.surface
                ),
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    text = stringResource(MR.strings.title_select_time),
                    style = MaterialTheme.typography.labelMedium
                )
                content()
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth()
                ) {
                    toggle()
                    Spacer(modifier = Modifier.weight(1f))
                    TextButton(
                        onClick = onCancel
                    ) { Text(text = stringResource(MR.strings.action_cancel)) }
                    TextButton(
                        onClick = onConfirm
                    ) { Text(text = stringResource(MR.strings.action_ok)) }
                }
            }
        }
    }
}
