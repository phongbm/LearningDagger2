package com.phongbm.learningdagger2.base

import android.os.Bundle
import androidx.lifecycle.ViewModel

/**
 * Created by PhongBM on 03/16/2020
 */

abstract class ViewModelBaseFragment<VM : ViewModel> : BaseFragment(), ViewModelBaseView<VM> {
    private lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = createViewModel()
    }

    override fun getViewModel() = viewModel

}