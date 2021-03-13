package com.endcorona.coketlist.ui.mycoket

import com.google.gson.annotations.SerializedName

data class WriteListRequest(
    @SerializedName("contents") val contents: String

    )