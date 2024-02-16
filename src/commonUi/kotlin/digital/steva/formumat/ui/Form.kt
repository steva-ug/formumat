package digital.steva.formumat.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Badge
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import digital.steva.formumat.FormumatConfig
import digital.steva.formumat.redux.Dispatcher
import digital.steva.formumat.redux.FormumatState
import digital.steva.formumat.redux.FormumatValues
import digital.steva.formumat.redux.SetCurrentPage
import digital.steva.formumat.redux.Stringish
import digital.steva.formumat.schema.ArrayType
import digital.steva.formumat.schema.BooleanType
import digital.steva.formumat.schema.ButtonField
import digital.steva.formumat.schema.CheckboxField
import digital.steva.formumat.schema.DataSchema
import digital.steva.formumat.schema.DateTimeField
import digital.steva.formumat.schema.DropdownField
import digital.steva.formumat.schema.EnumerableType
import digital.steva.formumat.schema.Field
import digital.steva.formumat.schema.IntegerField
import digital.steva.formumat.schema.IntegerType
import digital.steva.formumat.schema.LabelField
import digital.steva.formumat.schema.ListField
import digital.steva.formumat.schema.NumberField
import digital.steva.formumat.schema.NumberType
import digital.steva.formumat.schema.Page
import digital.steva.formumat.schema.RadiosField
import digital.steva.formumat.schema.RowField
import digital.steva.formumat.schema.Section
import digital.steva.formumat.schema.SliderField
import digital.steva.formumat.schema.StringType
import digital.steva.formumat.schema.SwitchField
import digital.steva.formumat.schema.TextField
import digital.steva.formumat.schema.Type
import digital.steva.formumat.schema.UiSchema

@Composable
actual fun FormView(
    uiSchema: UiSchema,
    dataSchema: DataSchema,
    state: FormumatState,
    dispatch: Dispatcher,
) {
    val pages by remember(uiSchema.items) { mutableStateOf(uiSchema.items.filterIsInstance<Page>()) }
    val values =
        FormumatValues(state.data, dataSchema.typesByKey, uiSchema.fieldsByKey, dispatch)
    val selectedPage = state.currentPage ?: pages.firstOrNull()
    PageView(
        selectedPage,
        selectedPage?.items ?: uiSchema.items,
        dataSchema.typesByKey,
        values,
        dispatch
    )
}

@Composable
actual fun Progress(
    pages: List<Page>,
    types: Map<String, Type>,
    values: FormumatValues
) {
    val requiredFields = pages.sumOf { calculateRequiredFieldsCount(it, types, values) }
    val missingRequiredFields = pages.sumOf { calculateMissingRequiredFieldsCount(it, types, values) }
    val progress = if (requiredFields > 1)
        (requiredFields - missingRequiredFields).toFloat() / requiredFields
    else 1.0f

    Box(contentAlignment = Alignment.Center) {
        CircularProgressIndicator(
            color = MaterialTheme.colorScheme.primary,
            progress = progress,
            trackColor = Color.LightGray
        )
        Text(text = "${(progress * 100).toInt()}")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
actual fun PageNavigationView(
    fields: List<Field>,
    types: Map<String, Type>,
    values: FormumatValues,
    selectedPage: Page?,
    dispatch: Dispatcher,
    onPageSelected: (Page) -> Unit,
) {
    val pages = fields.filterIsInstance<Page>()
    val pagesHaveIcons = pages.any { it.icon != null }
    val currentPage = when {
        (selectedPage != null) -> selectedPage
        else -> pages.firstOrNull()
    }

    @Composable
    fun renderPages(
        pages: List<Page>,
        pagesHaveIcons: Boolean = false,
        indent: Int = 0,
    ) {
        pages.filter { it.visible.eval(values) }.forEach { page ->
            val enabled = page.enabled.eval(values)
            NavigationDrawerItem(
                label = {
                    Text(
                        text = "${"…".repeat(indent)}${page.title.eval(values)}",
                        modifier = Modifier.padding(start = if (pagesHaveIcons && page.icon == null) 24.dp else 0.dp),
                        color = if (enabled) Color.Unspecified else Color.Gray
                    )
                },
                icon = {
                    if (page.icon != null) {
                        IconByName(
                            name = page.icon,
                            color = if (enabled) Color.Unspecified else Color.Gray
                        )
                    }
                },
                badge = {
                    val requiredFields =
                        calculateMissingRequiredFieldsCount(page, types, values)
                    if (requiredFields > 0) {
                        Badge(
                            containerColor = if (enabled) Color(0xFFF44336) else Color(0xFFF4a396),
                            contentColor = if (enabled) Color.White else Color.Gray
                        ) { Text(requiredFields.toString(), modifier = Modifier.padding(2.dp)) }
                    }
                },
                onClick = {
                    if (enabled) {
                        dispatch(SetCurrentPage(page))
                        onPageSelected(page)
                    }
                },
                selected = page == currentPage
            )
            renderPages(page.items.filterIsInstance<Page>(), pagesHaveIcons, indent + 1)
        }
    }

    renderPages(pages, pagesHaveIcons)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PageView(
    page: Page?,
    fields: List<Field>,
    types: Map<String, Type>,
    values: FormumatValues,
    dispatch: Dispatcher,
) {
    val listState = rememberLazyListState()
    LaunchedEffect(page) {
        listState.scrollToItem(0, 0)
    }
    LazyColumn(
        state = listState,
        modifier = Modifier.padding(start = 10.dp, end = 10.dp)
    ) {
        val enabled = page?.enabled?.eval(values) ?: true

        item { PageTitle(page?.title, values) }

        items(fields.filter { it !is Section }) {
            FieldView(
                it, types, values, dispatch,
                enabled && it.enabled.eval(values),
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
            )
        }

        fields.filterIsInstance<Section>().filter { it.visible.eval(values) }.forEach { section ->
            val sectionEnabled = enabled && section.enabled.eval(values)
            val title = section.title.eval(values)
            if (!title.isNullOrBlank()) {
                stickyHeader {
                    SectionHeader(title, sectionEnabled)
                }
            }
            items(section.items) {
                FieldView(
                    it, types, values, dispatch, sectionEnabled,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )
            }
        }
    }
}

@Composable
fun PageTitle(title: Stringish?, values: FormumatValues) {
    if (title != null) {
        Column(modifier = Modifier.padding(top = 8.dp, bottom = 14.dp)) {
            Text(
                text = title.eval(values),
                style = MaterialTheme.typography.headlineLarge
            )
            Divider()
        }
    }
}

@Composable
fun FieldView(
    field: Field,
    types: Map<String, Type>,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    if (field.visible.eval(values)) {
        val listContext = values.listContext
        val type = if (listContext != null)
            (types[listContext.listProperty] as ArrayType).items.properties[field.property]
        else
            types[field.property]

        when (field) {
            is LabelField -> LabelView(field, values, dispatch, enabled, modifier)
            is TextField -> TextView(field, type as? StringType, values, dispatch, enabled, modifier)
            is CheckboxField -> CheckboxView(field, type as? BooleanType, values, dispatch, enabled, modifier)
            is SwitchField -> SwitchView(field, type as? BooleanType, values, dispatch, enabled, modifier)
            is RadiosField -> RadiosView(field, type as? EnumerableType, values, dispatch, enabled, modifier)
            is DropdownField -> DropdownView(field, type as? EnumerableType, values, dispatch, enabled, modifier)
            is DateTimeField -> DateTimeView(field, type as? StringType, values, dispatch, enabled, modifier)
            is IntegerField -> IntegerView(field, type as? IntegerType, values, dispatch, enabled, modifier)
            is NumberField -> NumberView(field, type as? NumberType, values, dispatch, enabled, modifier)
            is SliderField -> SliderView(field, type as? IntegerType, values, dispatch, enabled, modifier)
            is ButtonField -> ButtonView(field, values, enabled, modifier)
            is RowField -> RowView(field, types, values, dispatch, enabled, modifier)
            is ListField -> ListView(field, type as? ArrayType, types, values, dispatch, enabled, modifier)
            else -> {
                FormumatConfig.views.forEach { it(field, type, types, values, dispatch, enabled, modifier) }
            }
        }
    }
}

@Composable
fun SectionHeader(
    title: String,
    enabled: Boolean
) {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Surface(
            color = MaterialTheme.colorScheme.tertiaryContainer,
            modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
            content = {
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(8.dp),
                    color = if (enabled) Color.Unspecified else Color.LightGray
                )
            },
        )
    }
}

@Composable
actual fun RowView(
    rowField: RowField,
    types: Map<String, Type>,
    values: FormumatValues,
    dispatch: Dispatcher,
    enabled: Boolean,
    modifier: Modifier
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        rowField.items.forEach { FieldView(it, types, values, dispatch, it.enabled.eval(values)) }
    }
}

fun calculateMissingRequiredFieldsCount(
    page: Page,
    types: Map<String, Type>,
    values: FormumatValues,
): Int {
    return page.countMissingRequired(types, values)
}

fun calculateRequiredFieldsCount(
    page: Page,
    types: Map<String, Type>,
    values: FormumatValues,
): Int {
    return page.countRequired(types, values)
}
