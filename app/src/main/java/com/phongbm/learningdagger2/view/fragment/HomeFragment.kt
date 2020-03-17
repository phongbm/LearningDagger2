package com.phongbm.learningdagger2.view.fragment

import androidx.lifecycle.ViewModelProvider
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.ViewModelBaseFragment
import com.phongbm.learningdagger2.viewmodel.HomeViewModel

class HomeFragment : ViewModelBaseFragment<HomeViewModel>() {
    override fun getContentViewId() = R.layout.fragment_home

    override fun initializeViews() {
    }

    override fun initializeComponents() {
    }

    override fun initializeData() {
    }

    override fun createViewModel(): HomeViewModel {
        return ViewModelProvider.AndroidViewModelFactory(activity!!.application).create(HomeViewModel::class.java)
    }

}