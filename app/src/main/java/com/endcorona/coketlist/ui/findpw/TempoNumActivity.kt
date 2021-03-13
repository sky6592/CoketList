package com.endcorona.coketlist.ui.findpw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.ActivityTempoNumBinding

class TempoNumActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityTempoNumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_tempo_num)

        mBinding.btnSentFindPw.setOnClickListener {
            startActivity(Intent(this, EnterChangePwActivity::class.java))
        }
    }
}