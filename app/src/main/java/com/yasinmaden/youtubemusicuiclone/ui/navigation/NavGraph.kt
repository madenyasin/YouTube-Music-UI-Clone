package com.yasinmaden.youtubemusicuiclone.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.yasinmaden.youtubemusicuiclone.ui.screens.ExploreScreen
import com.yasinmaden.youtubemusicuiclone.ui.screens.HomeScreen
import com.yasinmaden.youtubemusicuiclone.ui.screens.LibraryScreen

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(navController = navController, startDestination = Destinations.Home.route) {
        composable(Destinations.Home.route){
            HomeScreen(navController)
        }
        composable(Destinations.Explore.route){
            ExploreScreen(navController)
        }
        composable(Destinations.Library.route){
            LibraryScreen(navController)
        }
    }
}