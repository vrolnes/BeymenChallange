package com.example.beymenchallange.ui.feature.mainScreen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beymenchallange.data.remote.models.MainScreenData
import com.example.beymenchallange.data.local.models.FavoriteEntity
import com.example.beymenchallange.data.remote.ProductRemoteData
import com.example.beymenchallange.domain.FavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val productRemoteData: ProductRemoteData,
    private val favoriteUseCase: FavoriteUseCase
) : ViewModel() {

    private val _gridState = mutableStateOf(2)

    private val _responseState = mutableStateOf<MainScreenData?>(null)

    val gridState
        get() = _gridState

    val responseState
        get() = _responseState

    fun changeGrid() {
        if (_gridState.value == 1)
            _gridState.value = 2
        else
            _gridState.value = 1
    }

    fun getMainScreen() {
        var result: MainScreenData? = null
        viewModelScope.launch {
            runBlocking {
                result = productRemoteData.getMainPage(
                    siralama = "akillisiralama",
                    sayfa = "1",
                    categoryId = "10020",
                    includeDocuments = true
                )
                favoriteUseCase.getFavoriteItems().forEach { favProduct ->
                    result!!.Result.ProductList.forEach { product ->
                        if (favProduct.productId == product.ProductId) {
                            product.isFavorite = favProduct.isFavorite
                        }
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
        getMainScreen()
    }
}