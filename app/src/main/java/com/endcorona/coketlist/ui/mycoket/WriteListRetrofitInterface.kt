package com.endcorona.coketlist.ui.mycoket

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface WriteListRetrofitInterface {
    @POST("/contents")
    fun postWriteList(@Body writeListRequest: WriteListRequest): Call<WriteListResponse>
}