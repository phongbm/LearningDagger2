package com.phongbm.learningdagger2.base

import android.os.Bundle

/**
 * Created by PhongBM on 03/16/2020
 */

abstract class ViewModelBaseFragment<VM : BaseViewModel> : BaseFragment(), ViewModelBaseView<VM> {
    private lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = createViewModel()
    }

    override fun getViewModel() = viewModel

}