package com.example.isilvalo.santandertest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.isilvalo.santandertest.funcoes.toast
import com.example.isilvalo.santandertest.model.Fund
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RequestFund(this).callFund {fund ->
            aguarde.text = fund.screen.title
        }
    }
}
