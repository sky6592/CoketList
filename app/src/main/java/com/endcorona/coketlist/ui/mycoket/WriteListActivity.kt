package com.endcorona.coketlist.ui.mycoket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.ActivityWriteListBinding

class WriteListActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityWriteListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_write_list)
    }
}