package com.phongbm.learningdagger2.architecture.data.source.local.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.phongbm.learningdagger2.architecture.data.base.BaseDao
import com.phongbm.learningdagger2.architecture.data.entity.Invoice

/**
 * Created by PhongBM on 03/19/2020
 */

@Dao
interface InvoiceDao : BaseDao<Invoice> {
    @Query("""
        SELECT *
        FROM invoice
        """)
    fun getAllInvoice(): List<Invoice>

}