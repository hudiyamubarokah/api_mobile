package com.example.api_hud.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIConfig {
    const val baseURL = "https://rickandmortyapi.com/api/"
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getService() : APIServis{
        return getRetrofit().create(APIServis::class.java)
    }
}