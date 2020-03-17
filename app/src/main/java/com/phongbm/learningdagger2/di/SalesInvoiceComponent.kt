package com.phongbm.learningdagger2.di

import com.phongbm.learningdagger2.view.invoice.fragment.PendingInvoiceFragment
import com.phongbm.learningdagger2.view.invoice.fragment.ReservedInvoiceFragment
import com.phongbm.learningdagger2.view.invoice.fragment.SalesInvoiceFragment
import dagger.Subcomponent
import javax.inject.Scope

/**
 * Created by PhongBM on 03/17/2020
 */

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class SalesInvoiceScope

@SalesInvoiceScope
@Subcomponent
interface SalesInvoiceComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): SalesInvoiceComponent
    }

    fun inject(salesInvoiceFragment: SalesInvoiceFragment)
    fun inject(pendingInvoiceFragment: PendingInvoiceFragment)
    fun inject(reservedInvoiceFragment: ReservedInvoiceFragment)

}