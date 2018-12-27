package com.example.isilvalo.santandertest

import com.example.isilvalo.santandertest.model.Fund
import retrofit2.Call
import retrofit2.http.GET

interface ServiceFund {

    @GET("fund.json")
    fun get(): Call<Fund>
}