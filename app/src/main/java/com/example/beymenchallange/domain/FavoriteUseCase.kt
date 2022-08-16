package com.example.beymenchallange.domain

import com.example.beymenchallange.data.local.FavoriteLocalData
import com.example.beymenchallange.data.models.FavoriteEntity
import javax.inject.Inject

class FavoriteUseCase @Inject constructor(private val localFavorite: FavoriteLocalData) {

    fun getFavoriteItems(): List<FavoriteEntity> {
        return localFavorite.getFavorites()
    }

    fun setFavoriteItem(product: FavoriteEntity) {
        localFavorite.setFavorite(product)
    }

}