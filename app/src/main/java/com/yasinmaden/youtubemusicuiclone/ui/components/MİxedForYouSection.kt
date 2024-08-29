package com.yasinmaden.youtubemusicuiclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
fun MixedForYouSection(modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 30.dp, end = 20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Mixed for you", style = mixedForYouTextStyle)
            Button(onClick = { /*TODO*/ }, Modifier.size(83.dp, 40.dp), colors = ButtonDefaults.buttonColors(containerColor = moreButtonBackgroundColor, contentColor = Color.Black)) {
                Text(text = "More", style = filterChipTextStyle, fontSize = 14.sp)
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            items(SongDataSource1.songs) { song ->
                MixedForYouItem(song)
            }
            items(SongDataSource1.songs) { song ->
                MixedForYouItem(song)
            }
        }

    }
}

val mixedForYouFontFamily = FontFamily(
    Font(R.font.product_sans_regular, FontWeight.Bold)
)

val mixedForYouTextStyle = TextStyle(
    fontFamily = mixedForYouFontFamily, fontSize = 29.sp, fontWeight = FontWeight.Bold
)

val moreButtonBackgroundColor = Color(0xFFD7D2E4)

@Composable
fun MixedForYouItem(song: Song) {
    Card(
        modifier = Modifier.size(177.dp).clickable {  },
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(5.dp)
    ) {
        Image(
            painter = painterResource(id = song.drawableResId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()

        )
    }
}


@Preview(showBackground = true)
@Composable
fun MixedForYouSectionPreview() {
    MixedForYouSection()
}