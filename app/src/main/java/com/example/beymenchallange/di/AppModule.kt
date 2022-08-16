package com.example.beymenchallange.di

import android.content.Context
import androidx.room.Room
import com.example.beymenchallange.other.Constants.BASE_URL
import com.example.beymenchallange.data.api.ApiService
import com.example.beymenchallange.data.local.AppDatabase
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object API {

    @Singleton
    @Provides
    fun providesMoshi() = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    @Singleton
    @Provides
    fun providesRetrofit(moshi: Moshi) =
        Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(BASE_URL).build()

    @Singleton
    @Provides
    fun providesApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Singleton
    @Provides
    fun providesDB(@ApplicationContext context: Context): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "App.db"
    ).fallbackToDestructiveMigration().allowMainThreadQueries().build()

    @Provides
    fun providesFavoriteDao(database: AppDatabase) = database.favoriteDao()

}