package com.example.testdev.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.testdev.data.repositries.NasaRepository
import com.example.testdev.model.Item

class HomeViewModel(application: Application): AndroidViewModel(application) {
    private val repository: NasaRepository = NasaRepository()
    val nasaData: LiveData<List<Item>>
        get() = repository.nasaResult()

}