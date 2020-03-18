package com.phongbm.learningdagger2.viewmodel

import android.util.Log
import com.phongbm.learningdagger2.base.BaseViewModel
import com.phongbm.learningdagger2.repository.InvoiceRepository
import com.phongbm.learningdagger2.view.invoice.di.SalesInvoiceScope
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

@SalesInvoiceScope
class SalesInvoiceViewModel
@Inject
constructor() : BaseViewModel() {
    companion object {
        private const val TAG = "SalesInvoiceViewModel"
    }

    @Inject
    lateinit var invoiceRepository: InvoiceRepository

    fun testDoSomething() {
        Log.d(TAG, "testDoSomething()... ${invoiceRepository.hashCode()}")

        invoiceRepository.testDoSomething()
    }

}