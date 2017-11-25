package com.marvelgallery.data.network.provider

/**
 * Created by huzehao666 on 2017/11/16.
 */

import okhttp3.Interceptor

fun makeHeadersInterceptor()=Interceptor{chain ->
    chain.proceed(chain.request().newBuilder()
            .addHeader("Accept","application/json")
            .addHeader("Accept-Language","en")
            .addHeader("Content-Type","application/json")
            .build())
}
