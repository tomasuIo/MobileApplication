package com.marvelgallery.presenter

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by huzehao666 on 2017/11/16.
 */
abstract class BasePresenter : Presenter {
    protected var subscriptions = CompositeDisposable()

    override fun onViewDestoryed() {
        subscriptions.dispose()
    }
}