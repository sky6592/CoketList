package com.endcorona.coketlist.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.ActivityLogInBinding
import com.endcorona.coketlist.ui.findpw.FindPwActivity
import com.endcorona.coketlist.ui.signup.SignUpActivity

class LogInActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_log_in)
        mBinding.activity = this
    }

    fun onCheckLogin() {
        //서버 구현

    }

    fun onMoveSignUp(){
        return startActivity(Intent(this,SignUpActivity::class.java))
    }

    fun onMoveFindPw(){
        return startActivity(Intent(this,FindPwActivity::class.java))

    }

}