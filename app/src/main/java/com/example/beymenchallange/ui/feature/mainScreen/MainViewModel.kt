package com.example.beymenchallange.ui.feature.mainScreen

import androidx.compose.runtime.mutableStateOf
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

    private val _state = mutableStateOf(2)

    val state
    get() = _state

    fun changeGrid(){
        if (_state.value == 1)
            _state.value = 2
        else
            _state.value = 1
    }

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