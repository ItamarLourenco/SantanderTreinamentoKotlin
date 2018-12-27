package com.example.isilvalo.santandertest.model

class Screen(
    val title:String = "",
    val fundName:String = "",
    val whatIs:String = "",
    val definition:String = "",
    val riskTitle:String = "",
    val risk:Int = 0,
    val infoTitle:String = "",
    val moreInfo: MoreInfo,
    val info:List<Info>,
    val downInfo:List<DownInfo>
)