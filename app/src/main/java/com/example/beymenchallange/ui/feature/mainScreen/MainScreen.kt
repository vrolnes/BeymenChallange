package com.example.beymenchallange.ui.feature.mainScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.beymenchallange.ui.component.VerticalGrid


@Composable
fun MainScreen(
    onItemClicked: (String) -> Unit,
    mainViewModel: MainViewModel
) {
    mainViewModel.getMainScreen()?.let {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Change Grid Style", modifier = Modifier.clickable {
                mainViewModel.changeGrid()
            })
            it.Result.ProductList.let { it1 ->
                VerticalGrid(
                    gridItems = it1,
                    onItemClicked = onItemClicked,
                    cellSize = mainViewModel.state.value
                ) }
        }
    }
}