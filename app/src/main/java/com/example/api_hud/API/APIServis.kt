package com.example.api_hud.API

import com.example.api_hud.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface APIServis {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}