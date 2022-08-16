package com.example.beymenchallange.data.repository

import com.example.beymenchallange.data.local.FavoriteLocalData
import com.example.beymenchallange.data.local.models.FavoriteEntity
import com.example.beymenchallange.data.remote.ProductRemoteData
import com.example.beymenchallange.data.remote.models.DetailScreenData
import com.example.beymenchallange.data.remote.models.MainScreenData
import javax.inject.Inject

class AppRepository @Inject constructor(
    private val remoteData: ProductRemoteData,
    private val favoriteLocalData: FavoriteLocalData
) {
    fun getFavorites(): List<FavoriteEntity> {
        return favoriteLocalData.getFavorites()
    }

    fun setFavorite(productEntity: FavoriteEntity) {
        favoriteLocalData.setFavorite(productEntity)
    }

    suspend fun getMainPage(
        siralama: String,
        sayfa: String,
        categoryId: String,
        includeDocuments: Boolean
    ): MainScreenData {
        return remoteData.getMainPage(siralama, sayfa, categoryId, includeDocuments)
    }

    suspend fun getDetailPage(code: String): DetailScreenData {
        return remoteData.getDetailPage(code)
    }

}