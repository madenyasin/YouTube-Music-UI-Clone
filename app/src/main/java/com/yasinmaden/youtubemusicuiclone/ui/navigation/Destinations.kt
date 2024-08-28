package com.yasinmaden.youtubemusicuiclone.ui.navigation

sealed class Destinations(val route : String){
    data object Home: Destinations("home")
    data object ForYou: Destinations("for_you")
    data object Explore: Destinations("explore")
    data object Library: Destinations("library")
}