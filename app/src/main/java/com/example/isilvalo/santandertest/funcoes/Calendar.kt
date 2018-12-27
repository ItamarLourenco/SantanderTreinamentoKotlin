package com.example.isilvalo.santandertest.funcoes

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formataBr(): String{
    val format = SimpleDateFormat("dd/MM/yyyy")
    return "Data: " + format.format(time)
}