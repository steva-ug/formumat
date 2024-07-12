import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle

class PlaceholderTransformation(val placeholder: String, val placeholderColor: Color) : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        return PlaceholderFilter(text, placeholder, placeholderColor)
    }
}

fun PlaceholderFilter(text: AnnotatedString, placeholder: String, placeholderColor: Color): TransformedText {
    val numberOffsetTranslator = object : OffsetMapping {
        override fun originalToTransformed(offset: Int): Int {
            return 0
        }

        override fun transformedToOriginal(offset: Int): Int {
            return 0
        }
    }
    return TransformedText(buildAnnotatedString {
        withStyle(style = SpanStyle(color = placeholderColor)) {
            append(placeholder)
        }
    }, numberOffsetTranslator)
}

fun visualTransformToPlaceholderIfEmpty(value: String, defaultValue: String, defaultValueColor: Color): VisualTransformation {
    return if (value.isBlank()) {
        PlaceholderTransformation(defaultValue, defaultValueColor)
    } else {
        VisualTransformation.None
    }
}
