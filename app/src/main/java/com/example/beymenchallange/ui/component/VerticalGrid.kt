package com.example.beymenchallange.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.beymenchallange.models.Product

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalGrid(gridItems: List<Product>, onItemClicked: (String) -> Unit, cellSize: Int) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(cellSize),

        // content padding
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        )
    ) {
        items(gridItems.size) { index ->
            VerticalGridItem(scrollItem = gridItems[index], onItemClicked)
        }
    }
}

@Composable
fun VerticalGridItem(scrollItem: Product, onItemClicked: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
            .clickable {
                onItemClicked(scrollItem.ProductId.toString())
            }
    ) {
        ItemImage(
            scrollItem.ImageUrl,
            contentAlignment = Alignment.TopEnd,
            false
        )
    }
}