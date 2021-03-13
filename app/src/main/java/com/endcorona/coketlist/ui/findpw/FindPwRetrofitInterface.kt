package com.endcorona.coketlist.ui.findpw

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface FindPwRetrofitInterface {

    @POST("/users")
    fun postFindPw(@Body params: FindPwRequest): Call<FindPwResponse>
}