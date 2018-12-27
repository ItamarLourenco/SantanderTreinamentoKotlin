package com.example.isilvalo.santandertest.funcoes

import java.text.NumberFormat
import java.util.*

    fun Double.formatarBr(): String{
    val numberFormat =
        NumberFormat.
            getCurrencyInstance(Locale("pt", "BR"))

    return numberFormat.format(this)
}