package com.endcorona.coketlist.ui.login

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface LogInRetrofitlnterface {
//    @GET("/users")
//    fun getUsers() : Call<UserResponse>

    @POST("/sign-in")
    fun postSignUp(@Body logInRequest: LogInRequest): Call<LogInResponse>
}