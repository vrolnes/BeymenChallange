package com.example.beymenchallange.api

import com.example.beymenchallange.models.DetailScreenData
import com.example.beymenchallange.models.MainScreenData
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("list")
    suspend fun getMainPage(
        @Query("siralama") siralama: String,
        @Query("sayfa") sayfa: String,
        @Query("categoryId") categoryId: String,
        @Query("includeDocuments") includeDocuments: Boolean,
        ): MainScreenData

    @GET("product")
    suspend fun getDetailPage(
        @Query("productid") productid: String
    ): DetailScreenData
}