package com.phongbm.learningdagger2.architecture.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.Index
import com.phongbm.learningdagger2.architecture.data.base.BaseEntity
import com.phongbm.learningdagger2.architecture.domain.dto.InvoiceDTO
import java.math.BigDecimal

/**
 * Created by PhongBM on 03/19/2020
 */

@Entity(tableName = "invoice",
        indices = [
            Index("id", unique = true)
        ])
data class Invoice(@ColumnInfo(name = "number")
                   var number: String? = null,

                   @ColumnInfo(name = "subtotal")
                   var subtotal: BigDecimal = BigDecimal.ZERO) : BaseEntity() {
    @Ignore
    constructor(invoiceDTO: InvoiceDTO) : this() {
        super.from(invoiceDTO)
        number = invoiceDTO.number
        subtotal = invoiceDTO.subtotal
    }

}