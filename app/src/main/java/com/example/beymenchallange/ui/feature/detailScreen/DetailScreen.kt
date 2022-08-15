package com.example.beymenchallange.ui.feature.detailScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.akakcechallenge.ui.component.AsyncImage
import com.example.akakcechallenge.ui.component.DetailTopRow
//import com.example.beymenchallange.ui.component.ItemDetailInfo

@Composable
fun DetailScreen(code: String?, detailViewModel: DetailViewModel) {
//    detailViewModel.getDetailScreen(code.toString())?.let {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .verticalScroll(rememberScrollState())
//        ) {
//            DetailTopRow(it.result)
//            AsyncImage(
//                modifier = Modifier.fillMaxWidth(),
//                imageUrl = it.result.imageUrl
//            )
//            StorageRow(it.result)
//            ItemDetailInfo(modifier = Modifier.fillMaxWidth(), item = it.result)
//        }
//    }
}