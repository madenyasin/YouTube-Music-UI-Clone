package com.yasinmaden.youtubemusicuiclone.data

import androidx.annotation.DrawableRes
import com.yasinmaden.youtubemusicuiclone.R

data class Song(
    val title: String,
    @DrawableRes val drawableResId: Int
)

object SongDataSource1 {
    val songs = listOf(
        Song(
            title = "Princess Diana (with Nicki Minaj)",
            drawableResId = R.drawable.image_1
        ),
        Song(
            title = "PORTALS (Deluxe)",
            drawableResId = R.drawable.image_2
        ),
        Song(
            title = "Freak Mode",
            drawableResId = R.drawable.image_3
        ),
    )
}

object SongDataSource2 {
    val songs = listOf(
        Song(
            title = "Church Outfit",
            drawableResId = R.drawable.image_4
        ),
        Song(
            title = "Dumb Dumm",
            drawableResId = R.drawable.image_5
        ),
        Song(
            title = "Pink Venom",
            drawableResId = R.drawable.image_6
        ),
    )
}