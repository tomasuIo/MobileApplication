package com.marvelgallery.data.network.dto

/**
 * Created by huzehao666 on 2017/11/16.
 */
class ImageDto {
    lateinit var path: String
    lateinit var extension: String

    val completeImagePath: String
        get() = "&paht.&extension"
}