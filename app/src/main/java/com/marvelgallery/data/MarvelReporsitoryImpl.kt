package com.marvelgallery.data

import com.marvelgallery.data.network.MarvelApi
import com.marvelgallery.data.network.provider.retrofit
import com.marvelgallery.model.MarvelCharacter
import io.reactivex.Single

/**
 * Created by huzehao666 on 2017/11/16.
 */

class MarvelRepositoryImpl :MarvelRepository {
    val api = retrofit.create(MarvelApi::class.java)
    override fun getAllCharacters(searchQuery: String?): Single<List<MarvelCharacter>> = api.getCharacters(
            offset = 0,
            limit = elementsOnListLimit
    ).map {
        it.data?.results.orEmpty().map(::MarvelCharacter)
    }

    companion object {
        const val elementsOnListLimit = 50
    }

}
