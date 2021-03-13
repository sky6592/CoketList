package com.endcorona.coketlist.ui.login

import android.media.session.MediaSession
import com.google.gson.annotations.SerializedName

data class LogInResponse(
    @SerializedName("jwt") val jwt: String,
    @SerializedName("isSuccess") val isSuccess: Boolean,
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String
)