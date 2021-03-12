package com.endcorona.coketlist.ui.space

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.FragmentSpaceBinding

class SpaceFragment : Fragment(){

    private lateinit var mBinding: FragmentSpaceBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_space,container,false)


        return mBinding.root
    }
}