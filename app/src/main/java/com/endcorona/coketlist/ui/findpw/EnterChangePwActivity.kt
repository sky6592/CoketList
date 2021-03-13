package com.endcorona.coketlist.ui.findpw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.endcorona.coketlist.R
import com.endcorona.coketlist.config.BaseActivity
import com.endcorona.coketlist.databinding.ActivityEnterChangePwBinding
import com.endcorona.coketlist.databinding.ActivityLogInBinding
import com.endcorona.coketlist.ui.login.LogInActivity

class EnterChangePwActivity :
    BaseActivity<ActivityEnterChangePwBinding>(ActivityEnterChangePwBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnSentFindPw.setOnClickListener {
            startActivity(Intent(this,LogInActivity::class.java))
            finish()
        }
    }
}