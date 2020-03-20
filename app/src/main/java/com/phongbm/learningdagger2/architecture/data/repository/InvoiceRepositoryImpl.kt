package com.phongbm.learningdagger2.architecture.data.repository

import com.phongbm.learningdagger2.architecture.data.entity.Invoice
import com.phongbm.learningdagger2.architecture.data.source.local.database.datasource.InvoiceLocalDataSource
import com.phongbm.learningdagger2.architecture.data.source.remote.api.SalesApi
import com.phongbm.learningdagger2.architecture.domain.model.InvoiceModel
import com.phongbm.learningdagger2.architecture.domain.repository.InvoiceRepository
import io.reactivex.Single
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/19/2020
 */

@Singleton
class InvoiceRepositoryImpl
@Inject
constructor() : InvoiceRepository {
    @Inject
    lateinit var invoiceLocalDataSource: InvoiceLocalDataSource

    @Inject
    lateinit var salesApi: SalesApi

    override suspend fun getAllInvoices(): List<InvoiceModel> {
        return invoiceLocalDataSource.getAllInvoice().map {
            InvoiceModel(it)
        }
    }

    override fun getInvoiceData(invoiceId: String): Single<Boolean> {
        return salesApi.getInvoiceData(invoiceId).map {
            val wrapInvoiceDTO = it.result!!

            runBlocking {
                val invoiceDTO = wrapInvoiceDTO.invoiceDTO
                val invoice = Invoice(invoiceDTO)
                invoiceLocalDataSource.saveInvoice(invoice)
            }

            true
        }
    }

}