package com.yasinmaden.youtubemusicuiclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.yasinmaden.youtubemusicuiclone.ui.navigation.NavGraph
import com.yasinmaden.youtubemusicuiclone.ui.components.bottom_nav_bar.BottomBarNavigation
import com.yasinmaden.youtubemusicuiclone.ui.components.top_app_bar.CustomTopAppBar
import com.yasinmaden.youtubemusicuiclone.ui.screens.LocalInnerPadding
import com.yasinmaden.youtubemusicuiclone.ui.theme.YouTubeMusicUICloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YouTubeMusicUICloneTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = { BottomBarNavigation(navController = navController) },
                    topBar = { CustomTopAppBar() },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    CompositionLocalProvider(LocalInnerPadding provides innerPadding) {
                        NavGraph(navController = navController, modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    YouTubeMusicUICloneTheme {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = { BottomBarNavigation(navController = navController) },
            topBar = { CustomTopAppBar() },
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            NavGraph(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}