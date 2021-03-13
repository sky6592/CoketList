package com.endcorona.coketlist.ui.mycoket

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.FragmentMyCoketBinding

class MyCoketFragment : Fragment() {

    private lateinit var mBinding: FragmentMyCoketBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_coket, container, false)

        return mBinding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mBinding.ivAddMyCoket.setOnClickListener {
            startActivity(Intent(context,WriteListActivity::class.java))
        }
    }


}