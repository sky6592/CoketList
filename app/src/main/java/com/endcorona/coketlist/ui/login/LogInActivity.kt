package com.endcorona.coketlist.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_log_in)

    }
}