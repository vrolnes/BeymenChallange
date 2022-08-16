package com.example.beymenchallange.domain

import com.example.beymenchallange.data.local.models.FavoriteEntity
import com.example.beymenchallange.data.repository.AppRepository
import javax.inject.Inject

class FavoriteUseCase @Inject constructor(private val appRepository: AppRepository) {

    fun getFavoriteItems(): List<FavoriteEntity> {
        return appRepository.getFavorites()
    }

    fun setFavoriteItem(product: FavoriteEntity) {
        appRepository.setFavorite(product)
    }

}