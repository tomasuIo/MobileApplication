package com.marvelgallery.view.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.view.Window
import com.marvelgallery.R

import com.marvelgallery.model.MarvelCharacter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by huzehao666 on 2017/11/15.
 */
class MainActivity : AppCompatActivity() {
    private val characters = listOf(
            MarvelCharacter(name = "3-D Man",
                 imageUrl = "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"),
            MarvelCharacter(name = "Abomination (Emil Blonsky)",
                   imageUrl = "http://i.annihil.us/u/prod/marvel/i/mg/9/50/4ce18691cbf04.jpg"),
            MarvelCharacter(name = "3-D Man",
                    imageUrl = "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"),
            MarvelCharacter(name = "Abomination (Emil Blonsky)",
                    imageUrl = "http://i.annihil.us/u/prod/marvel/i/mg/9/50/4ce18691cbf04.jpg"),
            MarvelCharacter(name = "3-D Man",
                    imageUrl = "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg"),
            MarvelCharacter(name = "Abomination (Emil Blonsky)",
                    imageUrl = "http://i.annihil.us/u/prod/marvel/i/mg/9/50/4ce18691cbf04.jpg")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        val categoryItemsAdapers = characters.map(::CharacterItemAdapter)
        recyclerView.adapter = MainListAdapter(categoryItemsAdapers)
    }
}