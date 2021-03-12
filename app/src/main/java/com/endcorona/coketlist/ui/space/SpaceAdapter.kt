package com.endcorona.coketlist.ui.space

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.endcorona.coketlist.databinding.ItemRvCardviewBinding
import com.endcorona.coketlist.models.space.SpaceModel

/*
    [Reference]
    https://kangmin1012.tistory.com/16
 */
class SpaceAdapter(val spaceModelList: ArrayList<SpaceModel>) :
    RecyclerView.Adapter<SpaceAdapter.SpaceViewHolder>() {

    private val mData = listOf<SpaceModel>()

    //onCreateViewHolder == onCreate
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SpaceViewHolder {
        val binding = ItemRvCardviewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return SpaceViewHolder(binding)
    }

    override fun getItemCount(): Int = mData.size

    //when use to Scroll => 실행한다 onvBindViewHolder가!
    override fun onBindViewHolder(holder: SpaceViewHolder, position: Int) {
        holder.onBind(mData[position])
    }

    //View Holder
    class SpaceViewHolder(
        private val binding: ItemRvCardviewBinding
    ) : RecyclerView.ViewHolder(
        binding.root
    ) {
        fun onBind(model: SpaceModel) {
            binding.spaceData = model
        }
    }
}