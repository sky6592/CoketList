package com.endcorona.coketlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.endcorona.coketlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //기존 등록한 Theme에 의해 구조적으로 포함되어이쓴 Timt를 초기화 시켜준다
        mBinding.mainNavi.itemIconTintList = null



        mBinding.mainNavi.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.menu_my_coket ->{

                }
                R.id.menu_space -> {

                }
            }
        }

    }
}