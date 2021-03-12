package com.endcorona.coketlist.ui.findpw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.ActivityFindPwBinding

class FindPwActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityFindPwBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_find_pw)
    }
}