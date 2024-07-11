package com.navita.navitadocs.ui.theme.navitatheme

import androidx.compose.runtime.Composable

object NavitaTheme {
    val colors: NavitaColorScheme
        @Composable
        get() = LocalNavitaColorScheme.current

    val typography: NavitaFontScheme
        @Composable
        get() = LocalNavitaFontScheme.current
}