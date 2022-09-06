package com.example.testdev.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.testdev.model.Data
import com.example.testdev.model.Item
import com.example.testdev.model.Link

class DetailsViewModel(application: Application):AndroidViewModel(application){
    var data:Data? = null
    var link:Link? = null
}