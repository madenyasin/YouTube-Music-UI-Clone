package com.yasinmaden.youtubemusicuiclone.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yasinmaden.youtubemusicuiclone.ui.navigation.Destinations

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "HomeScreen", fontSize = 50.sp)
        Button(onClick = {
            navController.navigate(Destinations.ForYou.route)
        }) {
            Text(text = "Navigate to ForYouScreen")
        }
    }
}