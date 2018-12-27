package com.example.isilvalo.santandertest

import android.content.Context
import com.example.isilvalo.santandertest.funcoes.toast
import com.example.isilvalo.santandertest.model.Fund
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RequestFund(val context: Context){

    fun callFund(callbackFund: ((Fund) -> Unit) ) {
        RetrofitInitializer.retrofit
            .create(ServiceFund::class.java).get()
            .enqueue(object : Callback<Fund> {
                override fun onFailure(call: Call<Fund>, t: Throwable) {
                    context.toast("Ocorreu um erro no request")
                }

                override fun onResponse(call: Call<Fund>, response: Response<Fund>) {
                    val fund = response.body()
                    if(fund != null){
                        callbackFund(fund)
                    }
                }
            })
    }
}