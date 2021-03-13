package com.endcorona.coketlist.ui.findpw

interface FindPwView {
    fun onPostFindPwSuccess(response: FindPwResponse)

    fun onPostFindPwFailure(message: String)
}