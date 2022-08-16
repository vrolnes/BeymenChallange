package com.example.beymenchallange.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favoriteList")
data class FavoriteEntity(
    @PrimaryKey
    var productId: Int,
    var isFavorite: Boolean
)
