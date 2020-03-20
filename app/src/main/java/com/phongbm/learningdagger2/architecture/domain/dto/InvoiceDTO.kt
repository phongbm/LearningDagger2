package com.phongbm.learningdagger2.architecture.domain.dto

import com.phongbm.learningdagger2.architecture.domain.base.BaseDTO
import java.math.BigDecimal

/**
 * Created by PhongBM on 03/20/2020
 */

data class InvoiceDTO(var number: String? = null,
                      var subtotal: BigDecimal = BigDecimal.ZERO) : BaseDTO()