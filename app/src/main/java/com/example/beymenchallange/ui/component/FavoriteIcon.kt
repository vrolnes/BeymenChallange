package com.example.beymenchallange.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun FavoriteIcon() {
    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
    ) {
       AsyncImage(
           modifier = Modifier.wrapContentSize(),
           imageUrl = "https://commons.wikimedia.org/wiki/File:Star-icon.png"
       )
    }
}