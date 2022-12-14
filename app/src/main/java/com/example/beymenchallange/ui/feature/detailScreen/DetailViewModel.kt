package com.example.beymenchallange.ui.feature.detailScreen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beymenchallange.data.local.models.FavoriteEntity
import com.example.beymenchallange.data.remote.models.DetailScreenData
import com.example.beymenchallange.data.repository.AppRepository
import com.example.beymenchallange.domain.FavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val appRepository: AppRepository,
    private val favoriteUseCase: FavoriteUseCase
) : ViewModel() {

    private val _responseState = mutableStateOf<DetailScreenData?>(null)

    val responseState
        get() = _responseState


    fun getDetailScreen(code: String) {
        var result: DetailScreenData? = null
        viewModelScope.launch {
            runBlocking {
                result = appRepository.getDetailPage(code)
                favoriteUseCase.getFavoriteItems().forEach {
                    if (it.productId == result!!.Result?.ProductId) {
                        result!!.isFavorite = it.isFavorite
                    }
                }
            }
        }
        _responseState.value = result
    }


    fun setFavorite(productId: Int) {
        viewModelScope.launch {
            favoriteUseCase.getFavoriteItems().forEach {
                if (it.productId == productId) {
                    favoriteUseCase.setFavoriteItem(FavoriteEntity(productId, !it.isFavorite))
                    return@launch
                }
            }
            favoriteUseCase.setFavoriteItem(FavoriteEntity(productId, true))
        }
        getDetailScreen(productId.toString())
    }
}