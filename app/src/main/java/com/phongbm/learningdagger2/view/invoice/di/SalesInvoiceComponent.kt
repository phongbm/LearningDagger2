package com.phongbm.learningdagger2.view.invoice.di

import com.phongbm.learningdagger2.view.invoice.fragment.PendingInvoiceFragment
import com.phongbm.learningdagger2.view.invoice.fragment.ReservedInvoiceFragment
import com.phongbm.learningdagger2.view.invoice.fragment.SalesInvoiceFragment
import dagger.Subcomponent

/**
 * Created by PhongBM on 03/17/2020
 */

@SalesInvoiceScope
@Subcomponent(modules = [SalesInvoiceModule::class])
interface SalesInvoiceComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): SalesInvoiceComponent
    }

    fun inject(salesInvoiceFragment: SalesInvoiceFragment)
    fun inject(pendingInvoiceFragment: PendingInvoiceFragment)
    fun inject(reservedInvoiceFragment: ReservedInvoiceFragment)

}