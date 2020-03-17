package com.phongbm.learningdagger2.base

/**
 * Created by PhongBM on 03/16/2020
 */

interface ViewModelBaseView<out VM : BaseViewModel> : BaseView {
    fun createViewModel(): VM

    fun getViewModel(): VM

}