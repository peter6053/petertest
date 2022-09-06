package com.example.testdev.data.network

import com.example.testdev.model.Model
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MyApi {
    @GET("search?q=milky%20way&media_type=image&year_start=2017&year_end=2019")
    fun nasaResponse() : Call<Model>

    //will move the interface to it"sdifferenct folder for live production

    companion object {
        operator fun invoke() : MyApi {
            return Retrofit.Builder()
                .baseUrl("https://images-api.nasa.gov/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MyApi::class.java)
        }
    }
}