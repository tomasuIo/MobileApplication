package com.marvelgallery.view.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.marvelgallery.R
import com.marvelgallery.model.MarvelCharacter
import com.marvelgallery.view.common.ItemAdapter
import com.marvelgallery.view.common.bindView
import com.marvelgallery.view.common.loadImage

/**
 * Created by huzehao666 on 2017/11/9.
 */
class CharacterItemAdapter(
        val character: MarvelCharacter
) : ItemAdapter<CharacterItemAdapter.ViewHolder>(R.layout.item_character) {
    override fun onCreateViewHolder(itemView: View) = ViewHolder(itemView)
    override fun ViewHolder.onBindViewHolder() {
        textView.text = character.name
        imageView.loadImage(character.imageUrl)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textView by bindView<TextView>(R.id.textView)
        val imageView by bindView<ImageView>(R.id.imageView)
    }
}