package com.example.beymenchallange.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ItemImage(imageUrl: String, contentAlignment: Alignment, isFavorite: Boolean) {
    Box(
        modifier = Modifier.wrapContentWidth(),
        contentAlignment = contentAlignment
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            imageUrl = imageUrl
        )
        if (isFavorite)
        FavoriteIcon()
    }
}