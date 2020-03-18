package com.phongbm.learningdagger2.view.fragment

import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.ViewModelBaseFragment
import com.phongbm.learningdagger2.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : ViewModelBaseFragment<HomeViewModel>() {
    override fun getContentViewId() = R.layout.fragment_home

    override fun initializeViews() {
        btnInvoice.setOnClickListener(this)
        btnTaskMgt.setOnClickListener(this)
    }

    override fun initializeComponents() {
    }

    override fun initializeData() {
    }

    override fun createViewModel() = ViewModelProvider(this).get(HomeViewModel::class.java)

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnInvoice -> findNavController().navigate(R.id.salesInvoiceFragment)
            R.id.btnTaskMgt -> findNavController().navigate(R.id.taskMgtFragment)
        }
    }

}