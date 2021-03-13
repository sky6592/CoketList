package com.endcorona.coketlist.ui.mycoket

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.endcorona.coketlist.databinding.ItemRvMyCoketBinding
import com.endcorona.coketlist.models.space.mycoket.MyCoketModel

class MyCoketAdapter(val myCoketList: ArrayList<MyCoketModel>) :
    RecyclerView.Adapter<MyCoketAdapter.MyCoketViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyCoketViewHolder {
        val binding = ItemRvMyCoketBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return MyCoketViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyCoketViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return myCoketList.size
    }

    class MyCoketViewHolder(private val binding: ItemRvMyCoketBinding) :
        RecyclerView.ViewHolder(binding.root) {


    }


}