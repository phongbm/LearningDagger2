package com.phongbm.learningdagger2.architecture.data.source.repository

import com.phongbm.learningdagger2.architecture.data.entity.Invoice
import com.phongbm.learningdagger2.architecture.domain.InvoiceRepository

/**
 * Created by PhongBM on 03/19/2020
 */

class InvoiceRepositoryImpl : InvoiceRepository {
    override suspend fun saveInvoice(invoice: Invoice): Boolean {
        // TODO
        return false
    }

}