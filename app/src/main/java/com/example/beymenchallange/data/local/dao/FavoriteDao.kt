package com.example.beymenchallange.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beymenchallange.data.local.models.FavoriteEntity

@Dao
interface FavoriteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setFavorite(productEntity: FavoriteEntity)

    @Query("SELECT * FROM favoriteList")
    fun getFavorites(): List<FavoriteEntity>


}