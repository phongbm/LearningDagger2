package com.phongbm.learningdagger2.architecture.data.source.local.database.datasource

import com.phongbm.learningdagger2.architecture.data.entity.Invoice
import com.phongbm.learningdagger2.architecture.data.source.local.database.DatabaseManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/20/2020
 */

@Singleton
class InvoiceLocalDataSource
@Inject
constructor() {
    private val coroutineContext = Dispatchers.IO

    private val accountDatabase = DatabaseManager.accountDatabase

    private val invoiceDao = accountDatabase.invoiceDao()

    suspend fun saveInvoice(invoice: Invoice) = withContext(coroutineContext) {
        invoiceDao.save(invoice)
    }

    suspend fun getAllInvoice() = withContext(coroutineContext) {
        invoiceDao.getAllInvoice()
    }

}