package com.yasinmaden.youtubemusicuiclone.ui.navigation

import android.graphics.drawable.Icon
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.yasinmaden.youtubemusicuiclone.R

sealed class Destinations(
    val route: String,
    val label: String,
    val icon: @Composable () -> Unit
) {
    data object Home : Destinations(
        "home",
        "Home",
        {
            Icon(
                painter = painterResource(id = R.drawable.home_screen_icon),
                contentDescription = null
            )
        })

    data object Explore : Destinations(
        "explore",
        "Explore",
        {
            Icon(
                painter = painterResource(id = R.drawable.explore_icon),
                contentDescription = null
            )
        })

    data object Library : Destinations(
        "library",
        "Library",
        {
            Icon(
                painter = painterResource(id = R.drawable.library_music_icon),
                contentDescription = null
            )
        })
}