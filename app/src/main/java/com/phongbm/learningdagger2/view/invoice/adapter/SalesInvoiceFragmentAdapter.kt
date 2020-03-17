package com.phongbm.learningdagger2.view.invoice.adapter

import androidx.viewpager2.adapter.FragmentStateAdapter
import com.phongbm.learningdagger2.base.BaseFragment
import com.phongbm.learningdagger2.view.invoice.fragment.PendingInvoiceFragment
import com.phongbm.learningdagger2.view.invoice.fragment.ReservedInvoiceFragment
import com.phongbm.learningdagger2.view.invoice.fragment.SalesInvoiceFragment

/**
 * Created by PhongBM on 03/17/2020
 */

class SalesInvoiceFragmentAdapter(fragment: SalesInvoiceFragment) : FragmentStateAdapter(fragment) {
    private val fragments = ArrayList<BaseFragment>()
    private val pageNames = ArrayList<String>()

    init {
        fragments.add(PendingInvoiceFragment())
        fragments.add(ReservedInvoiceFragment())

        pageNames.add("Pending")
        pageNames.add("Reserved")
    }

    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int) = fragments[position]

    fun getPageName(position: Int) = pageNames[position]

}