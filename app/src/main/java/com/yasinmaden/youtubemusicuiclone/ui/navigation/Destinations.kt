package com.yasinmaden.youtubemusicuiclone.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.yasinmaden.youtubemusicuiclone.R

sealed class Destinations(
    val route: String,
    val label: String,
    val selectedIcon: @Composable () -> Unit,
    val unSelectedIcon: @Composable () -> Unit
) {
    data object Home : Destinations(
        route = "home",
        label = "Home",
        {
            Icon(
                painter = painterResource(id = R.drawable.home_screen_icon),
                contentDescription = null
            )
        },
        {
            Icon(
                painter = painterResource(id = R.drawable.outline_home_24),
                contentDescription = null
            )
        }
    )

    data object Explore : Destinations(
        route = "explore",
        label = "Explore",
        {
            Icon(
                painter = painterResource(id = R.drawable.explore_icon),
                contentDescription = null
            )
        },
        {
            Icon(
                painter = painterResource(id = R.drawable.outline_explore_24),
                contentDescription = null
            )
        }
    )

    data object Library : Destinations(
        route = "library",
        label = "Library",
        {
            Icon(
                painter = painterResource(id = R.drawable.library_music_icon),
                contentDescription = null
            )
        },
        {
            Icon(
                painter = painterResource(id = R.drawable.library_music_outlined),
                contentDescription = null
            )
        }
    )
}