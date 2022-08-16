package com.example.beymenchallange.data.remote

import com.example.beymenchallange.data.remote.api.ApiService
import com.example.beymenchallange.data.remote.models.DetailScreenData
import com.example.beymenchallange.data.remote.models.MainScreenData
import javax.inject.Inject

class ProductRemoteData @Inject constructor(private val apiService: ApiService) {
    suspend fun getMainPage(
        siralama: String,
        sayfa: String,
        categoryId: String,
        includeDocuments: Boolean
    ): MainScreenData {
        return apiService.getMainPage(siralama, sayfa, categoryId, includeDocuments)
    }

    suspend fun getDetailPage(code: String): DetailScreenData {
        return apiService.getDetailPage(code)
    }
}