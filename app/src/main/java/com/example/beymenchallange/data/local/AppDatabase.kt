package com.example.beymenchallange.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.beymenchallange.data.local.dao.FavoriteDao
import com.example.beymenchallange.data.local.models.FavoriteEntity

@Database(
    entities = [FavoriteEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun favoriteDao(): FavoriteDao

}