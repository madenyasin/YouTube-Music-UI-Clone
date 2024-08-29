package com.yasinmaden.youtubemusicuiclone.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yasinmaden.youtubemusicuiclone.R

@Composable
fun FilterChipButton(text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = chipButtonBackgroundColor,
            contentColor = Color.Black
        ),
        modifier = Modifier
            .fillMaxWidth()
            .size(width = 98.dp, height = 36.dp)
    ) {
        Text(text = text, style = filterChipTextStyle)
    }
}

val filterChipFontFamily = FontFamily(
    Font(R.font.product_sans_medium, FontWeight.Normal)
)

val filterChipTextStyle = TextStyle(
    fontFamily = filterChipFontFamily,
    fontSize = 11.sp,
    fontWeight = FontWeight.Bold
)

val chipButtonTexts = listOf(
    "Workout",
    "Relax",
    "Energize",
    "Commute",
    "Study"
)

val chipButtonBackgroundColor = Color(0xFFD7D2E4)

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FilterChipButton("Workout")
}