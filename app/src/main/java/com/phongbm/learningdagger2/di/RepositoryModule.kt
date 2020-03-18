package com.phongbm.learningdagger2.di

import com.phongbm.learningdagger2.repository.InvoiceRepository
import com.phongbm.learningdagger2.repository.impl.InvoiceRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/19/2020
 */

@Module
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindInvoiceRepository(invoiceRepositoryImpl: InvoiceRepositoryImpl): InvoiceRepository

}