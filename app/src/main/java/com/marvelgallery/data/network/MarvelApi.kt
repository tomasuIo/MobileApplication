package com.marvelgallery.data.network

import com.marvelgallery.data.network.dto.CharacterMarvelDto
import com.marvelgallery.data.network.dto.DataWrapper
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by huzehao666 on 2017/11/16.
 */
interface MarvelApi {
    @GET("characters")
    fun getCharacters(
            @Query("offset") offset: Int?,
            @Query("limit") limit: Int?
    ): Single<DataWrapper<List<CharacterMarvelDto>>>
}