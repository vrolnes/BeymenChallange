package com.example.beymenchallange.ui.feature.detailScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.beymenchallange.ui.component.AsyncImage
import com.example.beymenchallange.ui.component.ItemDescription
import com.example.beymenchallange.ui.component.ItemDetailInfo

@Composable
fun DetailScreen(code: String?, detailViewModel: DetailViewModel) {
    detailViewModel.getDetailScreen(code.toString())?.let {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            AsyncImage(
                modifier = Modifier.fillMaxWidth(),
                imageUrl = it.Result?.Images?.get(0)?.Images?.get(0)?.ImageUrl.toString()
            )
            it.Result?.let { it1 ->
                ItemDetailInfo(modifier = Modifier.fillMaxWidth(), item = it1)
                ItemDescription(modifier = Modifier.fillMaxWidth(), item = it1)
            }
        }
    }
}