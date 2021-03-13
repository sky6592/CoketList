package com.endcorona.coketlist.ui.mycoket

import com.google.gson.annotations.SerializedName

data class WriteListResponse(
    @SerializedName("isSuccess") val isSuccess: Boolean,
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: String
)

