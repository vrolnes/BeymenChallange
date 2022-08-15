package com.example.beymenchallange.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.akakcechallenge.ui.component.AsyncImage

@Composable
fun ItemImage(imageUrl: String, contentAlignment: Alignment, isFavorite: Boolean) {
    Box(
        modifier = Modifier.wrapContentWidth(),
        contentAlignment = contentAlignment
    ) {
        AsyncImage(
            modifier = Modifier
                .wrapContentWidth()
                .padding(32.dp),
            imageUrl = imageUrl
        )
        if (isFavorite)
        FavoriteIcon()
    }
}