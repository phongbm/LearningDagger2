package com.phongbm.learningdagger2.architecture.data.source.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.phongbm.learningdagger2.architecture.data.entity.Invoice
import com.phongbm.learningdagger2.architecture.data.source.local.database.dao.InvoiceDao

/**
 * Created by PhongBM on 03/20/2020
 */

@Database(
        entities = [
            Invoice::class
        ],
        version = 1,
        exportSchema = false
)
@TypeConverters(
        BigDecimalConverter::class
)
abstract class AccountDatabase : RoomDatabase() {
    abstract fun invoiceDao(): InvoiceDao

}