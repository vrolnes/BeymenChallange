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
fun ItemImage(modifier: Modifier,imageUrl: String, contentAlignment: Alignment, isFavorite: Boolean = false) {
    Box(
        modifier = modifier,
        contentAlignment = contentAlignment
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            imageUrl = imageUrl
        )
        FavoriteIcon(isFavorite)
    }
}