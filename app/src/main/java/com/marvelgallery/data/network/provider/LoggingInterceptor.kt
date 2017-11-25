package com.marvelgallery.data.network.provider

import com.marvelgallery.BuildConfig
import okhttp3.logging.HttpLoggingInterceptor

/**
 * Created by huzehao666 on 2017/11/16.
 */
fun makeLoggingInterceptor()=HttpLoggingInterceptor().apply {
    level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
    else HttpLoggingInterceptor.Level.NONE
}