package com.example.beymenchallange.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.beymenchallange.data.remote.models.Product

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalGrid(
    gridItems: List<Product>,
    onItemClicked: (String) -> Unit,
    cellSize: Int,
    onFavClicked: (Int) -> Unit
) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(cellSize),
    ) {
        items(gridItems.size) { index ->
            VerticalGridItem(scrollItem = gridItems[index], onItemClicked, onFavClicked)
        }
    }
}

@Composable
fun VerticalGridItem(
    scrollItem: Product,
    onItemClicked: (String) -> Unit,
    onFavClicked: (Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
            .clickable {
                onItemClicked(scrollItem.ProductId.toString())
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ItemImage(
            Modifier.fillMaxWidth(),
            scrollItem.ImageUrl,
            contentAlignment = Alignment.TopEnd,
            scrollItem.isFavorite ?: false
        ) {
            onFavClicked(scrollItem.ProductId)
        }
        Text(text = scrollItem.DisplayName)
    }
}