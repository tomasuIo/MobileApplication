package com.marvelgallery.view.common

import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by huzehao666 on 2017/11/9.
 */
open class RecyclerListAdapter(
        var items:List<AnyItemAdapter> = listOf()
):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override final fun getItemCount() = items.size
    override final fun getItemViewType(position: Int) = items[position].layoutId
    override final fun onCreateViewHolder(parent: ViewGroup, layoutId: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(layoutId,parent,false)
        return items.first{ it.layoutId == layoutId }.onCreateViewHolder(itemView)
    }
    override final fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        items[position].bindViewHolder(holder)
    }
}
typealias AnyItemAdapter=ItemAdapter
    <out RecyclerView.ViewHolder>