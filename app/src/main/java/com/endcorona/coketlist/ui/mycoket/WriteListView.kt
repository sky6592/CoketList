package com.endcorona.coketlist.ui.mycoket

interface WriteListView {
    fun onPostWriteListSuccess(listResponse: WriteListResponse)
    fun onPostWriteListFailure(message: String)
}