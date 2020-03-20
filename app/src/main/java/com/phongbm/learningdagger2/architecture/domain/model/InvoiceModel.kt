package com.phongbm.learningdagger2.architecture.domain.model

import com.phongbm.learningdagger2.architecture.data.entity.Invoice
import com.phongbm.learningdagger2.architecture.domain.base.BaseModel
import java.math.BigDecimal

/**
 * Created by PhongBM on 03/20/2020
 */

data class InvoiceModel(var number: String? = null,
                        var subtotal: BigDecimal = BigDecimal.ZERO) : BaseModel() {
    constructor(invoice: Invoice) : this() {
        super.from(invoice)
        number = invoice.number
        subtotal = invoice.subtotal
    }

}