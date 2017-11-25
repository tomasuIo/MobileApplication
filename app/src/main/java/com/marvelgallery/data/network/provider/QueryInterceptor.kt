package com.marvelgallery.data.network.provider

import com.marvelgallery.BuildConfig
import okhttp3.Interceptor

/**
 * Created by huzehao666 on 2017/11/16.
 */
fun makeAddSecurityQueryInterceptor() = Interceptor { chain ->
    val originalRequest = chain.request()
    val timeStamp = System.currentTimeMillis()
    val url = originalRequest.url().newBuilder()
            .addQueryParameter("apikey",BuildConfig.PUBLIC_KEY)
            .addQueryParameter("ts","$timeStamp")
            .addQueryParameter("hash",
                    calculatedMd5(timeStamp.ToString()
                    +BuildConfig.PRIVATE_KEY
                    +BuildConfig.PUBLIC_KEY))
            .build()
    val request = originalRequest
            .newBuilder()
            .url(url)
            .build()
    chain.proceed(request)
}