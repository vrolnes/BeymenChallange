package com.example.beymenchallange.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.beymenchallange.models.DetailResult
import com.example.beymenchallange.models.Product

//@Composable
//fun ItemInfo(modifier: Modifier, item: HorizontalProduct) {
//    Column(modifier = modifier) {
//        Text(text = item.name.toString(), color = Color.Blue)
//        Spacer(modifier = Modifier.width(4.dp))
//        Text(text = "${item.price.toString()} TL", fontWeight = FontWeight.ExtraBold)
//        Text(text = "${item.countOfPrices.toString()} satıcı >", fontWeight = FontWeight.Light)
//        Text(text = "${item.followCount.toString()} takip")
//    }
//}
//
//@Composable
//fun ItemInfo(modifier: Modifier, item: Product) {
//    Column(modifier = modifier) {
//        Text(text = item.name.toString(), color = Color.Blue)
//        Spacer(modifier = Modifier.width(4.dp))
//        Text(text = "${item.price.toString()} TL", fontWeight = FontWeight.ExtraBold)
//        if (item.countOfPrices != null) Text(
//            text = "${item.countOfPrices.toString()} satıcı >",
//            fontWeight = FontWeight.Light
//        )
//        if (item.followCount != null) Text(text = "${item.followCount.toString()} takip")
//    }
//}
//
//
//@Composable
//fun ItemDetailInfo(modifier: Modifier, item: DetailResult) {
//    Column(
//        modifier = modifier,
//        verticalArrangement = Arrangement.spacedBy(4.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        item.let {
//            Text(text = "${it.countOfPrices} satıcı >", fontWeight = FontWeight.Bold)
//            Text(text = "${it.price} TL", fontWeight = FontWeight.Bold)
//            if (it.freeShipping) Text(text = "Ücretsiz Kargo", color = Color.Green)
//            Text(text = "Son güncelleme: ${it.lastUpdate}", color = Color.Gray)
//        }
//    }
//}