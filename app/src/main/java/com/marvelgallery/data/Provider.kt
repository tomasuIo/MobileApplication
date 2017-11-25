package com.marvelgallery.data

/**
 * Created by huzehao666 on 2017/11/16.
 */
abstract class Provider<T> {
    abstract fun creator(): T
    private val instance: T by lazy { creator() }
    var testingInstance: T? = null
    fun get(): T = testingInstance ?: instance
}