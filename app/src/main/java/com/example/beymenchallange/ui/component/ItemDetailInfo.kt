package com.example.beymenchallange.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.beymenchallange.models.DetailResult

@Composable
fun ItemDetailInfo(modifier: Modifier, item: DetailResult) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item.let {
            Text(text = it.DisplayName.toString())
            Text(text = it.CategoryName.toString())
            Text(text = it.ActualPriceText.toString())
        }
    }
}

@Composable
fun ItemDescription(modifier: Modifier, item: DetailResult) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.Start
    ) {
        item.let {
            Text(text = it.DisplayName.toString())
            Text(text = it.CategoryName.toString())
            Text(text = it.ActualPriceText.toString())        }
    }
}