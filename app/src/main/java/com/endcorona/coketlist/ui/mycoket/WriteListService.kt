package com.endcorona.coketlist.ui.mycoket

import com.endcorona.coketlist.config.ApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WriteListService(val view: WriteListView) {

    fun tryPostWriteList(writeListRequest: WriteListRequest){
        val writeListRetrofitInterface = ApplicationClass.sRetrofit.create(WriteListRetrofitInterface::class.java)
        writeListRetrofitInterface.postWriteList(writeListRequest).enqueue(object : Callback<WriteListResponse>{
            override fun onResponse(call: Call<WriteListResponse>, listResponse: Response<WriteListResponse>) {
                view.onPostWriteListSuccess(listResponse.body() as WriteListResponse)
            }

            override fun onFailure(call: Call<WriteListResponse>, t: Throwable) {
                view.onPostWriteListFailure(t.message ?: "통신 오류")
            }
        })
    }


}