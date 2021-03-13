package com.endcorona.coketlist.ui.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.ActivitySignUpBinding
import com.endcorona.coketlist.ui.endcorona.EndCoronaActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)

        // x버튼
        mBinding.imgBtnTitleSignUp.setOnClickListener {
            finish()
        }
    }

    fun closePage(view: View) {
        finish()
    }

    fun pressSignUP(view: View) {
        //성공 > 코로나 끝날 날짜 확인
        return startActivity(Intent(this, EndCoronaActivity::class.java))
    }
}