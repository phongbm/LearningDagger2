package com.phongbm.learningdagger2.architecture.data.di

import com.phongbm.learningdagger2.architecture.data.repository.InvoiceRepositoryImpl
import com.phongbm.learningdagger2.architecture.data.repository.UserRepositoryImpl
import com.phongbm.learningdagger2.architecture.domain.repository.InvoiceRepository
import com.phongbm.learningdagger2.architecture.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/20/2020
 */

@Module
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

    @Singleton
    @Binds
    abstract fun bindInvoiceRepository(repositoryImpl: InvoiceRepositoryImpl): InvoiceRepository

}