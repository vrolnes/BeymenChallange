package com.example.beymenchallange.ui.feature.mainScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beymenchallange.models.MainScreenData
import com.example.beymenchallange.api.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val apiService: ApiService) : ViewModel() {
    fun getMainScreen(): MainScreenData? {
        var result: MainScreenData? = null
        viewModelScope.launch {
            runBlocking {
                result = apiService.getMainPage(
                    siralama = "akillisiralama",
                    sayfa = "1",
                    categoryId = "10020",
                    includeDocuments = true
                    )
            }
        }
        return result
    }
}