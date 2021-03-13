package com.endcorona.coketlist.ui.findpw

import com.google.gson.annotations.SerializedName

data class FindPwRequest(
    @SerializedName("email") val email: String

)