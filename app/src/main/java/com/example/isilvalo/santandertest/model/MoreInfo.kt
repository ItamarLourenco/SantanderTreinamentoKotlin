package com.example.isilvalo.santandertest.model

import com.google.gson.annotations.SerializedName

class MoreInfo (
    val month: MoreInfoStructure,
    val year: MoreInfoStructure,
    @SerializedName("12months") val _12months: MoreInfoStructure
)

class MoreInfoStructure(val fund:Double = 0.0, val CDI:Double = 0.0)
