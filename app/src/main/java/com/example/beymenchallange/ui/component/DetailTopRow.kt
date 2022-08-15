package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.beymenchallange.models.DetailResult

@Composable
fun DetailTopRow(detailResult: DetailResult) {
    detailResult.let {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(text = it.BrandName, color = Color.Blue)
                Text(text = it.DisplayName)
                Text(text = it.ActualPriceText, modifier = Modifier.background(Color.Yellow))
            }
        }
    }
}