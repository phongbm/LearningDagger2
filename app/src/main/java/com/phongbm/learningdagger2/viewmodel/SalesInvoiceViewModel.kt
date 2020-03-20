package com.phongbm.learningdagger2.viewmodel

import android.util.Log
import com.phongbm.learningdagger2.architecture.domain.model.InvoiceModel
import com.phongbm.learningdagger2.architecture.domain.repository.InvoiceRepository
import com.phongbm.learningdagger2.base.BaseViewModel
import com.phongbm.learningdagger2.view.invoice.di.SalesInvoiceScope
import io.reactivex.Single
import java.util.*
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

    suspend fun getAllInvoices(): List<InvoiceModel> {
        Log.d(TAG, "getAllInvoices()... ${invoiceRepository.hashCode()}")

        return invoiceRepository.getAllInvoices()
    }

    fun getInvoiceData(): Single<Boolean> {
        val invoiceId = UUID.randomUUID().toString()
        return invoiceRepository.getInvoiceData(invoiceId)
    }

}