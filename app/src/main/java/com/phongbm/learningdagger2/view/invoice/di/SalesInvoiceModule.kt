package com.phongbm.learningdagger2.view.invoice.di

import androidx.lifecycle.ViewModel
import com.phongbm.learningdagger2.di.viewmodel.ViewModelKey
import com.phongbm.learningdagger2.viewmodel.SalesInvoiceViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by PhongBM on 03/18/2020
 */

@Module
abstract class SalesInvoiceModule {
    @Binds
    @IntoMap
    @ViewModelKey(SalesInvoiceViewModel::class)
    abstract fun bindViewModel(viewModel: SalesInvoiceViewModel): ViewModel

}