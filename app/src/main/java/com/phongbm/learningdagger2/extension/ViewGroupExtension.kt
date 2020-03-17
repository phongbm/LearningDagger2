package com.phongbm.learningdagger2.extension

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

/**
 * Created by PhongBM on 03/16/2020
 */

fun ViewGroup?.inflate(inflater: LayoutInflater, @LayoutRes layoutResId: Int): View {
    return inflater.inflate(layoutResId, this, false)
}