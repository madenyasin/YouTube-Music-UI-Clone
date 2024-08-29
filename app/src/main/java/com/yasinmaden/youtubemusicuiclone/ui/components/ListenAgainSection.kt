package com.yasinmaden.youtubemusicuiclone.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yasinmaden.youtubemusicuiclone.R

@Composable
fun ListenAgainSection(modifier: Modifier = Modifier){
    Column(Modifier.fillMaxSize().padding(start = 20.dp, top = 30.dp)) {
        Text(text = "Listen again", style = listenAgainTextStyle)
    }
}

val listenAgainFontFamily = FontFamily(
    Font(R.font.product_sans_regular, FontWeight.Normal)
)


val listenAgainTextStyle = TextStyle(
    fontFamily = listenAgainFontFamily,
    fontSize = 29.sp,
    fontWeight = FontWeight.Bold
)
@Preview(showBackground = true)
@Composable
fun ListenAgainSectionPreview(){
    ListenAgainSection()
}