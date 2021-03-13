package com.endcorona.coketlist.ui.findpw

import com.endcorona.coketlist.config.ApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FindPwService(val view:FindPwView) {

    fun tryPostFindPw(findPwRequest: FindPwRequest){
        val findPwRetrofitInterface = ApplicationClass.sRetrofit.create(FindPwRetrofitInterface::class.java)
        findPwRetrofitInterface.postFindPw(findPwRequest).enqueue(object :
            Callback<FindPwResponse> {
            override fun onResponse(call: Call<FindPwResponse>, response: Response<FindPwResponse>) {
                view.onPostFindPwSuccess(response.body() as FindPwResponse)
            }

            override fun onFailure(call: Call<FindPwResponse>, t: Throwable) {
                view.onPostFindPwFailure(t.message ?: "통신 오류")
            }
        })
    }
}