package com.marvelgallery.view.views

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import java.util.jar.Attributes

/**
 * Created by huzehao666 on 2017/11/9.
 */
class SquareFrameLayout @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet?=null,
        defStyleAttr: Int = 0
) :FrameLayout(context, attrs,  defStyleAttr){
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
}