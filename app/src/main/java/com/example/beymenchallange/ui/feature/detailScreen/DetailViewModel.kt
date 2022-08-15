package com.example.beymenchallange.ui.feature.detailScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beymenchallange.models.DetailScreenData
import com.example.beymenchallange.api.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val apiService: ApiService) : ViewModel() {
    fun getDetailScreen(code: String): DetailScreenData? {
        var result: DetailScreenData? = null
        viewModelScope.launch {
            runBlocking {
                result = apiService.getDetailPage(code)
            }
        }
        return result
    }
}