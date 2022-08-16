package com.example.beymenchallange.ui.feature.mainScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.beymenchallange.ui.component.VerticalGrid


@Composable
fun MainScreen(
    onItemClicked: (String) -> Unit,
    mainViewModel: MainViewModel
) {
    LaunchedEffect(key1 = null){
        mainViewModel.getMainScreen()
    }
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Change Grid Style", modifier = Modifier.clickable {
                mainViewModel.changeGrid()
            })
            mainViewModel.responseState.value?.Result?.ProductList.let { it1 ->
                if (it1 != null) {
                    VerticalGrid(
                        gridItems = it1,
                        onItemClicked = onItemClicked,
                        cellSize = mainViewModel.gridState.value
                    ){
                        mainViewModel.setFavorite(it)
                    }
                }
            }
        }
}