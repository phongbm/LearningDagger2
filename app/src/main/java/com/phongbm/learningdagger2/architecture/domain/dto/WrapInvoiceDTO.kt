package com.phongbm.learningdagger2.architecture.domain.dto

import com.phongbm.learningdagger2.architecture.domain.base.BaseDTO

/**
 * Created by PhongBM on 03/20/2020
 */

data class WrapInvoiceDTO(var invoiceDTO: InvoiceDTO) : BaseDTO()