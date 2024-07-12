package com.navita.navitastore.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.navita.docs.R
import com.navita.navitadocs.ui.theme.navitatheme.NavitaTheme

@Composable
fun BottomButton(
    modifier: Modifier,
    text: String = stringResource(id = R.string.bottom_button_default_text),
    onClick: () -> Unit = {},
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(0),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = NavitaTheme.colors.primary,
            contentColor = NavitaTheme.colors.white
        )

    ) {
        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
private fun BottomButtonPreview() {
        BottomButton(Modifier)
}