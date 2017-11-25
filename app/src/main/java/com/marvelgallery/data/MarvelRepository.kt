package com.marvelgallery.data

import com.marvelgallery.model.MarvelCharacter
import io.reactivex.Single

/**
 * Created by huzehao666 on 2017/11/16.
 */
interface MarvelRepository {
    fun getAllCharacters(searchQuery: String?): Single<List<MarvelCharacter>>
    companion object : Provider<MarvelRepository>(){
        override fun creator() = MarvelRepositoryImpl();
    }
}