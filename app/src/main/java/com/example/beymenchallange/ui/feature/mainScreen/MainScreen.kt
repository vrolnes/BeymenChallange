package com.example.beymenchallange.ui.feature.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.beymenchallange.ui.component.VerticalGrid


@Composable
fun MainScreen(
    onItemClicked: (String) -> Unit,
    mainViewModel: MainViewModel
) {
    mainViewModel.getMainScreen()?.let {
        Column(modifier = Modifier.fillMaxSize()) {
            it.Result.ProductList.let { it1 ->
                VerticalGrid(
                    gridItems = it1,
                    onItemClicked = onItemClicked,
                    cellSize = 2
                ) }
        }
    }
}