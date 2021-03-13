package com.endcorona.coketlist.ui.endcorona

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.MainActivity
import com.endcorona.coketlist.R
import com.endcorona.coketlist.config.BaseActivity
import com.endcorona.coketlist.databinding.ActivityEndCoronaBinding

/*
http://mentorsvc.blogspot.com/2016/08/calendarview.html
 */
class EndCoronaActivity : BaseActivity<ActivityEndCoronaBinding>(ActivityEndCoronaBinding::inflate){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //날짜 정보 받아오기
        binding.calendarEndCorona.setOnDateChangeListener { view, year, month, dayOfMonth ->

        }

        binding.btnLogIn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))

        }
    }
}