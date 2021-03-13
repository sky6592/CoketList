package com.endcorona.coketlist.ui.login

import com.google.gson.annotations.SerializedName

data class LogInRequest (
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("passwordCheck") val passwordCheck: String,
    @SerializedName("userName") val userName: String,
)