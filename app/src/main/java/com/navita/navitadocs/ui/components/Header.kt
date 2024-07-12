package com.navita.navitadocs.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.navita.docs.R
import com.navita.navitadocs.ui.theme.navitatheme.NavitaTheme

@Composable
fun Header(){
    Row (modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .background(NavitaTheme.colors.primary)
        .shadow(elevation = 20.dp)
    ){
        Box(
            modifier = Modifier
                .background(NavitaTheme.colors.white)
                .width(50.dp)
        ){
            Image(
                modifier = Modifier
                    .offset(x = 17.dp, y = 5.dp),
                painter = painterResource(id = R.drawable.docs_logo),
                contentDescription = "Image",
            )
        }
        Text(
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 30.dp),
            text = (stringResource(id = R.string.company_name)+ stringResource(id = R.string.app_name)),
            color = NavitaTheme.colors.white,
            fontWeight = FontWeight.W500,
            fontSize = NavitaTheme.typography.typography.titleMedium.fontSize
        )
    }
}

@Preview
@Composable
private fun HeaderPreview() {
    Header()
}