package com.yasinmaden.youtubemusicuiclone.ui.components.top_app_bar

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yasinmaden.youtubemusicuiclone.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar() {
    TopAppBar(
        title =
        {
            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()

            ) {
                Image(
                    painter = painterResource(id = R.drawable.yt_music_logo),
                    contentDescription = null,
                    modifier = Modifier.size(95.dp).padding(start = 5.dp)
                )
                Row (modifier = Modifier.width(150.dp), horizontalArrangement = Arrangement.SpaceEvenly){

                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.rounded_cast_connected_24),
                        contentDescription = null,
                        modifier = Modifier.clickable {  }
                    )
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.baseline_search_24),
                        contentDescription = null,
                        modifier = Modifier.clickable {  }
                    )
                    Image(painter = painterResource(id = R.drawable.user), contentDescription = null, Modifier.size(24.dp).clickable {  })
                }
            }
        })
}

@Preview
@Composable
fun TopAppBarPreview() {
    CustomTopAppBar()
}