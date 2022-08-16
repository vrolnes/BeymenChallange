package com.example.beymenchallange.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun FavoriteIcon(isFavorite: Boolean, onFavClicked: () -> Unit) {
    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
            .clickable {
                onFavClicked()
            }
    ) {
       AsyncImage(
           modifier = Modifier.wrapContentSize(),
           imageUrl = if (!isFavorite)
               "https://icons-for-free.com/download-icon-favorite+favourite+premium+rate+rating+star+icon-1320166547676710135_128.ico"
       else "https://icons-for-free.com/download-icon-favorite+okay+popular+star+yes+icon-1320195383600362076_128.png"
       )
    }
}