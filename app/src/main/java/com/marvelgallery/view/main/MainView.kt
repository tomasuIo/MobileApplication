package com.marvelgallery.view.main

import com.marvelgallery.model.MarvelCharacter

/**
 * Created by huzehao666 on 2017/11/16.
 */
interface MainView {
    var refresh: Boolean
    fun show(items: List<MarvelCharacter>)
    fun showError(error: Throwable)
}