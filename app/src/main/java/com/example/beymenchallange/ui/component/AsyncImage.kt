package com.example.akakcechallenge.ui.component

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.SubcomposeAsyncImage

@Composable
fun AsyncImage(modifier: Modifier, imageUrl: String) {
    SubcomposeAsyncImage(
        modifier = modifier,
        model = imageUrl,
        loading = {
            CircularProgressIndicator()
        },
        contentDescription = ""
    )
}