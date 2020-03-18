package com.phongbm.learningdagger2.di

import com.phongbm.learningdagger2.view.invoice.di.SalesInvoiceComponent
import com.phongbm.learningdagger2.view.task.di.TaskMgtComponent
import dagger.Module

/**
 * Created by PhongBM on 03/17/2020
 */

@Module(
        subcomponents = [
            SalesInvoiceComponent::class,
            TaskMgtComponent::class
        ]
)
class AppSubcomponentModule