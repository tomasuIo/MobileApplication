package com.marvelgallery.model

import com.marvelgallery.data.network.dto.CharacterMarvelDto

/**
 * Created by huzehao666 on 2017/11/9.
 */
data class MarvelCharacter(
        var name :String,
        var imageUrl : String
){
    constructor(dto: CharacterMarvelDto): this(
            name = dto.name,
            imageUrl = dto.imageUrl
    )
}