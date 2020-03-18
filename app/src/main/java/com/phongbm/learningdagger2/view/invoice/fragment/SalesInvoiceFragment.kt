package com.phongbm.learningdagger2.view.invoice.fragment

import android.content.Context
import android.util.Log
import com.google.android.material.tabs.TabLayoutMediator
import com.phongbm.learningdagger2.App
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.BaseFragment
import com.phongbm.learningdagger2.di.SalesInvoiceComponent
import com.phongbm.learningdagger2.view.invoice.adapter.SalesInvoiceFragmentAdapter
import com.phongbm.learningdagger2.viewmodel.SalesInvoiceViewModel
import kotlinx.android.synthetic.main.fragment_sales_invoice.*
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

class SalesInvoiceFragment : BaseFragment() {
    companion object {
        private const val TAG = "SalesInvoiceFragment"
    }

    lateinit var salesInvoiceComponent: SalesInvoiceComponent
        private set

    @Inject
    lateinit var salesInvoiceViewModel: SalesInvoiceViewModel

    private lateinit var salesInvoiceFragmentAdapter: SalesInvoiceFragmentAdapter

    override fun onAttach(context: Context) {
        super.onAttach(context)

        salesInvoiceComponent = App.instance.appComponent.salesInvoiceComponent().create()
        salesInvoiceComponent.inject(this)
    }

    override fun getContentViewId() = R.layout.fragment_sales_invoice

    override fun initializeViews() {
    }

    override fun initializeComponents() {
        salesInvoiceFragmentAdapter = SalesInvoiceFragmentAdapter(this)

        vpgSalesInvoice.adapter = salesInvoiceFragmentAdapter

        TabLayoutMediator(tabSalesInvoice, vpgSalesInvoice) { tab, position ->
            tab.text = salesInvoiceFragmentAdapter.getPageName(position)
        }.attach()
    }

    override fun initializeData() {
        Log.d(TAG, "initializeData()... ${salesInvoiceViewModel.hashCode()}")
    }

}