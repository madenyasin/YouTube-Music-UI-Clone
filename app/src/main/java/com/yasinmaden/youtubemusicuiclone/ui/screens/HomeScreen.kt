package com.yasinmaden.youtubemusicuiclone.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yasinmaden.youtubemusicuiclone.ui.components.FilterChipButton
import com.yasinmaden.youtubemusicuiclone.ui.components.ListenAgainSection
import com.yasinmaden.youtubemusicuiclone.ui.components.MixedForYouItem
import com.yasinmaden.youtubemusicuiclone.ui.components.MixedForYouSection
import com.yasinmaden.youtubemusicuiclone.ui.components.chipButtonTexts

@Composable
fun HomeScreen(navController: NavController) {
    val innerPadding = LocalInnerPadding.current
    // Scroll state oluşturuyoruz
    val scrollState = rememberScrollState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .verticalScroll(scrollState)
    ) {
        LazyRow(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(chipButtonTexts) { text ->
                FilterChipButton(
                    text
                )
            }
        }
        ListenAgainSection()
        MixedForYouSection()
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = NavController(LocalContext.current))
}