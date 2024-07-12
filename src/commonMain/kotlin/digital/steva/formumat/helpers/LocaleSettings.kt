import androidx.compose.ui.text.intl.Locale

data class LocaleSettings(
    val decimalSeparator: Char,
    val dateFormatShort: String,
    val timeFormatShort: String,
) {
    companion object {
        fun ofLanguage(language: String): LocaleSettings {
            return localeSettingsByCountry.get(language.uppercase()) ?: localeSettingsByCountry.get("EN")!!
        }

        fun ofCurrentLanguage(): LocaleSettings {
            return ofLanguage(Locale.current.language)
        }
    }
}

private val localeSettingsByCountry = mapOf(
    "DE" to LocaleSettings(',', "dd.MM.yyyy", "HH:mm"),
    "EN" to LocaleSettings('.', "MM-dd-yyyy", "HH:mm"),
)
