package com.phongbm.learningdagger2.architecture.data.di

import com.phongbm.learningdagger2.architecture.data.source.local.database.datasource.InvoiceLocalDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/20/2020
 */

@Module
class LocalDataSourceModule {
    @Singleton
    @Provides
    fun provideInvoiceLocalDataSource() = InvoiceLocalDataSource()

}