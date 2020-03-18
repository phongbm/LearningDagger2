package com.phongbm.learningdagger2.base

import androidx.lifecycle.ViewModel

/**
 * Created by PhongBM on 03/16/2020
 */

interface ViewModelBaseView<out VM : ViewModel> : BaseView {
    fun createViewModel(): VM

    fun getViewModel(): VM

}