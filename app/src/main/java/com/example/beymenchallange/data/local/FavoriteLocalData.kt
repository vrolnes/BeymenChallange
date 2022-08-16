package com.example.beymenchallange.data.local

import com.example.beymenchallange.data.local.dao.FavoriteDao
import com.example.beymenchallange.data.models.FavoriteEntity
import javax.inject.Inject

class FavoriteLocalData @Inject constructor(private val favoriteDao: FavoriteDao) {

    fun getFavorites(): List<FavoriteEntity> {
        return favoriteDao.getFavorites()
    }

    fun setFavorite(productEntity: FavoriteEntity) {
        favoriteDao.setFavorite(productEntity)
    }
}