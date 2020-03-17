package com.phongbm.learningdagger2.base

/**
 * Created by PhongBM on 03/16/2020
 */

interface BaseView {
    fun getContentViewId(): Int

    fun initializeViews()

    fun initializeComponents()

    fun initializeData()

}