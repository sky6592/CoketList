package com.endcorona.coketlist.ui.login

import com.endcorona.coketlist.config.ApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LogInService(val view: LogInView) {

    fun tryPostSignUp(postSignUpRequest: LogInRequest){
        val logInRetrofitInterface = ApplicationClass.sRetrofit.create(LogInRetrofitlnterface::class.java)
        logInRetrofitInterface.postSignUp(postSignUpRequest).enqueue(object :
            Callback<LogInResponse> {
            override fun onResponse(call: Call<LogInResponse>, response: Response<LogInResponse>) {
                view.onPostSignUpSuccess(response.body() as LogInResponse)
            }

            override fun onFailure(call: Call<LogInResponse>, t: Throwable) {
                view.onPostSignUpFailure(t.message ?: "통신 오류")
            }
        })
    }
}