package com.phongbm.learningdagger2.architecture.domain.repository

import com.phongbm.learningdagger2.architecture.domain.model.InvoiceModel
import io.reactivex.Single

/**
 * Created by PhongBM on 03/19/2020
 */

interface InvoiceRepository {
    suspend fun getAllInvoices(): List<InvoiceModel>

    fun getInvoiceData(invoiceId: String): Single<Boolean>

}