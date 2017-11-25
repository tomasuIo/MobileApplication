package com.marvelgallery.view.main

import com.marvelgallery.view.common.AnyItemAdapter
import com.marvelgallery.view.common.RecyclerListAdapter

/**
 * Created by huzehao666 on 2017/11/9.
 */
class MainListAdapter(items:List<AnyItemAdapter>):RecyclerListAdapter(items) {
    fun add(itemAdapter: AnyItemAdapter){
        items+=itemAdapter
        val index = items.indexOf(itemAdapter)
        if(index == -1) return
        notifyItemInserted(index)
    }

    fun delete(itemAdapter: AnyItemAdapter) {
        val index = items.indexOf(itemAdapter)
        if (index == -1) return
        items -= itemAdapter
        notifyItemRemoved(index)
    }
}