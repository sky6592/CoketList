package com.endcorona.coketlist.ui.endcorona

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.ActivityEndCoronaBinding

/*
http://mentorsvc.blogspot.com/2016/08/calendarview.html
 */
class EndCoronaActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityEndCoronaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_end_corona)
    }
}