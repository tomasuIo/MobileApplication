package com.marvelgallery.data.network.dto


/**
 * Created by huzehao666 on 2017/11/16.
 */
class CharacterMarvelDto {
    lateinit var name: String
    lateinit var thumbnail: ImageDto

    var imageUrl: String
        get() = thumbnail.completeImagePath
}