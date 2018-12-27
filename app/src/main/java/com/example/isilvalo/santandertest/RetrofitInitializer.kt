package com.example.isilvalo.santandertest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    companion object {
        val retrofit = Retrofit
            .Builder()
            .baseUrl("https://floating-mountain-50292.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}