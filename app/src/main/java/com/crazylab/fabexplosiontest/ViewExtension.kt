package com.crazylab.fabexplosiontest

import android.view.View
import android.view.animation.Animation

class ViewExtension {

    fun View.startAnimation(animation :Animation,onEnd : () -> Unit)
    {
        animation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(p0: Animation?) = Unit

            override fun onAnimationEnd(p0: Animation?) {
                onEnd
            }

            override fun onAnimationRepeat(p0: Animation?)  = Unit

        })
        startAnimation(animation)
    }
}