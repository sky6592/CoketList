package com.endcorona.coketlist.ui.space

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class SpaceAdapter(val spaceList: ArrayList<SpaceModel>) :
    RecyclerView.Adapter<SpaceAdapter.SpaceViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SpaceAdapter.SpaceViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: SpaceAdapter.SpaceViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    //holder : 뷰에대한 것을 잡아준다
    class SpaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


}