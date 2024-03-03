package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlin.random.Random

class SharedViewModel : ViewModel() {
    private val _searchParameters = MutableLiveData("123")
    val searchParameters: LiveData<String> = _searchParameters

    fun setSearchParameters() {
        viewModelScope.launch {
            Random.nextInt(0, 100).let {
                _searchParameters.value = it.toString()
            }
        }
    }
}