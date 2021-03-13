package com.endcorona.coketlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.endcorona.coketlist.databinding.ActivityMainBinding
import com.endcorona.coketlist.ui.mycoket.MyCoketFragment
import com.endcorona.coketlist.ui.space.SpaceFragment

class MainActivity : AppCompatActivity() {

    //DataBinding init
    private lateinit var mBinding: ActivityMainBinding

    //Fragment init
    private val mycoketFragment by lazy { MyCoketFragment() }
    private val spaceFragment by lazy { SpaceFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //기존 등록한 Theme에 의해 구조적으로 포함되어이쓴 Timt를 초기화 시켜준다
        // => drawable-selector 사용을 위한 설정
        mBinding.mainNavi.itemIconTintList = null


        //Bottom navigation
        mBinding.mainNavi.run {
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_my_coket -> {
                        replaceFragment(mycoketFragment)
                    }
                    R.id.menu_space -> {
                        replaceFragment(spaceFragment)
                    }
                }
                true
            }
            //First Selected Item
            selectedItemId = R.id.menu_my_coket
        }
    }


    //Replace Fragment
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_main, fragment)
            .commit()
    }

}