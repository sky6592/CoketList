package com.endcorona.coketlist.ui.findpw

import com.google.gson.annotations.SerializedName

data class FindPwResponse(
    @SerializedName("isSuccess") val isSuccess: Boolean,
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String
)
