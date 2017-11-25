package com.marvelgallery.presenter

import android.support.v7.app.AppCompatActivity

/**
 * Created by huzehao666 on 2017/11/16.
 */
abstract class BaseActivityWithPresenter : AppCompatActivity() {
    abstract val presenter: Presenter

    override fun onDestroy() {
        super.onDestroy()
        presenter.onViewDestoryed()
    }
}