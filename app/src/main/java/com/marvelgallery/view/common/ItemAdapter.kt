package com.marvelgallery.view.common

import android.support.annotation.LayoutRes
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by huzehao666 on 2017/11/9.
 */
abstract class ItemAdapter<T:RecyclerView.ViewHolder>
(@LayoutRes open val layoutId: Int) {
    abstract fun onCreateViewHolder(itemView: View):T

    @Suppress("UNCHECKED_CAST")
    fun bindViewHolder(holder: RecyclerView.ViewHolder){
        (holder as T).onBindViewHolder()
    }
    abstract fun T.onBindViewHolder()
}