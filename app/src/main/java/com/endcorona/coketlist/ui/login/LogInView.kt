package com.endcorona.coketlist.ui.login

interface LogInView {
//    fun onGetUserSuccess(response: LogInResponse)
//
//    fun onGetUserFailure(message: String)

    fun onPostSignUpSuccess(response: LogInResponse)

    fun onPostSignUpFailure(message: String)
}