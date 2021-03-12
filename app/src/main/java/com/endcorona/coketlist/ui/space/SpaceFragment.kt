package com.endcorona.coketlist.ui.space

import android.content.ClipData.Item
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.endcorona.coketlist.R
import com.endcorona.coketlist.databinding.FragmentSpaceBinding
import com.endcorona.coketlist.models.space.SpaceModel


class SpaceFragment() : Fragment() {

    private lateinit var mBinding: FragmentSpaceBinding

    //To make for View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_space, container, false)

        return mBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //서버 연동을 해야한다..!!
        val modelList = arrayListOf(
            SpaceModel(R.drawable.ic_lock, "sky", "2020-01-01", "내용을 입려합니다", 30),
            SpaceModel(R.drawable.ic_lock, "sky", "2020-01-01", "내용을 입려합니다", 30),
            SpaceModel(R.drawable.ic_lock, "sky", "2020-01-01", "내용을 입려합니다", 30),
            SpaceModel(R.drawable.ic_lock, "sky", "2020-01-01", "내용을 입려합니다", 30),
            SpaceModel(R.drawable.ic_lock, "sky", "2020-01-01", "내용을 입려합니다", 30)
        )


        mBinding.rvSpaceFragment.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL, false)
        mBinding.rvSpaceFragment.setHasFixedSize(true)
        mBinding.rvSpaceFragment.adapter = SpaceAdapter(modelList)

    }
}