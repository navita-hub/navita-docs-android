package com.navita.navitadocs.ui.theme.navitatheme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class NavitaColorScheme(
    val primary: Color = Color(0xFF6DB9D5),
    val secondary: Color = Color(0xFF00B23D),
    val white: Color = Color(0xFFFFFFFF),
    val black: Color = Color(0xFF000000)
)

val LocalNavitaColorScheme = staticCompositionLocalOf {
    NavitaColorScheme()
}