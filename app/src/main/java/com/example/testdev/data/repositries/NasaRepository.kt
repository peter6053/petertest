package com.example.testdev.data.repositries

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.testdev.data.network.MyApi
import com.example.testdev.model.Item
import com.example.testdev.model.Model
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NasaRepository {
    private val mNasaDataList = ArrayList<Item>()
    private val mutableLiveData = MutableLiveData<List<Item>>()

    fun nasaResult() : MutableLiveData<List<Item>> {
        MyApi().nasaResponse()
            .enqueue(object : Callback<Model>{
                override fun onResponse(
                    call: Call<Model>,
                    response: Response<Model>,
                ) {
                    if (response.isSuccessful) {
                        Log.e("Error",response.body().toString())
                        val model: Model? = response.body();
                        mNasaDataList.addAll(model!!.collection.items)
                        mutableLiveData.value = mNasaDataList
                    } else {
                        Log.e("Res E",response.errorBody().toString())
                    }
                }

                override fun onFailure(call: Call<Model>, t: Throwable) {
                    Log.e("Res F",t.message.toString())
                }

            })

        return mutableLiveData
    }
}