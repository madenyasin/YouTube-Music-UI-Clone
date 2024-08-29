package com.yasinmaden.youtubemusicuiclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yasinmaden.youtubemusicuiclone.R
import com.yasinmaden.youtubemusicuiclone.data.Song
import com.yasinmaden.youtubemusicuiclone.data.SongDataSource1
import com.yasinmaden.youtubemusicuiclone.data.SongDataSource2

@Composable
fun ListenAgainSection(modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 20.dp, top = 30.dp)
    ) {
        Text(text = "Listen again", style = listenAgainTextStyle)
        Spacer(modifier = Modifier.height(30.dp))
        LazyRow (horizontalArrangement = Arrangement.spacedBy(16.dp)){
            items(SongDataSource1.songs) { song ->
                ListenAgainItem(song)
            }
            items(SongDataSource1.songs) { song ->
                ListenAgainItem(song)
            }
        }
        Spacer(modifier = Modifier.height(25.dp))

        LazyRow (horizontalArrangement = Arrangement.spacedBy(16.dp)){
            items(SongDataSource2.songs) { song ->
                ListenAgainItem(song)
            }
            items(SongDataSource2.songs) { song ->
                ListenAgainItem(song)
            }

        }
    }
}

@Composable
fun ListenAgainItem(song: Song) {
    Card(modifier = Modifier.size(115.dp, 160.dp), colors = CardDefaults.cardColors(containerColor = Color.Transparent)) {
        Image(
            painter = painterResource(id = song.drawableResId),
            contentDescription = null,
            modifier = Modifier.size(115.dp)
        )

        Text(
            text = song.title,
            style = filterChipTextStyle,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 15.dp, start = 3.dp)
        )
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
fun ListenAgainSectionPreview() {


    ListenAgainSection()

}