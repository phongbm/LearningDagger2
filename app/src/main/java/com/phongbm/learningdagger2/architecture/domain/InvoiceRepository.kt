package com.phongbm.learningdagger2.architecture.domain

import com.phongbm.learningdagger2.architecture.data.entity.Invoice

/**
 * Created by PhongBM on 03/19/2020
 */

interface InvoiceRepository {
    suspend fun saveInvoice(invoice: Invoice): Boolean

}