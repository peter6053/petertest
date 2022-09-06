package com.example.testdev.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.testdev.R
import com.example.testdev.databinding.ItemHomeRvBinding
import com.example.testdev.interfaces.HomeRecyclerView
import com.example.testdev.model.Item

class HomeAdapter: RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private var mNasaItems: ArrayList<Item>? = null
    var homeListener:HomeRecyclerView? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val mDeveloperListItemBinding = DataBindingUtil.inflate<ItemHomeRvBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_home_rv, parent, false
        )

        return HomeViewHolder(mDeveloperListItemBinding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val nasaItem = mNasaItems!![position]
        holder.homeViewHolderBinding.homeViewModel = nasaItem.data.get(0)
        holder.homeViewHolderBinding.linkViewModel = nasaItem.links.get(0)
        holder.homeViewHolderBinding.Image.setOnClickListener {
            homeListener?.onClick(nasaItem)
        }
    }

    override fun getItemCount(): Int {
        return if (mNasaItems != null) {
            mNasaItems!!.size
        } else {
            0
        }
    }

    fun setItemsList(mItemModel: ArrayList<Item>) {
        this.mNasaItems = mItemModel
        notifyDataSetChanged()
    }

    inner class HomeViewHolder(var homeViewHolderBinding:ItemHomeRvBinding): RecyclerView.ViewHolder(homeViewHolderBinding.root)
}