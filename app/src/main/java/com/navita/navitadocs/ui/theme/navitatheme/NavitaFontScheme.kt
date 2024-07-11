package com.navita.navitadocs.ui.theme.navitatheme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.navita.docs.R

@Immutable
data class NavitaFontScheme(
    private val defaultTypography: Typography = Typography(),
    val navitaFontFamily: FontFamily = FontFamily(
        listOf(
            Font(
                resId = R.font.roboto_regular,
                weight = FontWeight.Normal,
                style = FontStyle.Normal
            ),
            Font(
                resId = R.font.roboto_bold,
                weight = FontWeight.Bold,
                style = FontStyle.Normal
            ),
            Font(
                resId = R.font.roboto_italic,
                weight = FontWeight.Normal,
                style = FontStyle.Italic
            )
        )
    ),
    val typography: Typography = Typography(
        bodySmall = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 12.sp
        ),
        bodyMedium = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 14.sp
        ),
        bodyLarge = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 16.sp
        ),
        titleSmall = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 16.sp
        ),
        titleMedium = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 20.sp
        ),
        titleLarge = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 24.sp
        ),
        headlineSmall = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 18.sp
        ),
        headlineMedium = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 22.sp
        ),
        headlineLarge = defaultTypography.bodyMedium.copy(
            fontFamily = navitaFontFamily,
            fontSize = 26.sp
        ),
    )
)

val LocalNavitaFontScheme = staticCompositionLocalOf {
    NavitaFontScheme()
}