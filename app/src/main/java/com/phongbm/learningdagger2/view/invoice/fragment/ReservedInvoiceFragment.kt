package com.phongbm.learningdagger2.view.invoice.fragment

import android.content.Context
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.BaseFragment
import com.phongbm.learningdagger2.viewmodel.SalesInvoiceViewModel
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

class ReservedInvoiceFragment : BaseFragment() {
    companion object {
        private const val TAG = "ReservedInvoiceFragment"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<SalesInvoiceViewModel> { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (parentFragment as SalesInvoiceFragment).salesInvoiceComponent.inject(this)
    }

    override fun getContentViewId() = R.layout.fragment_reserved_invoice

    override fun initializeViews() {
    }

    override fun initializeComponents() {
    }

    override fun initializeData() {
        Log.d(TAG, "initializeData()... ${viewModel.hashCode()}")
    }

}