package com.phongbm.learningdagger2.viewmodel

import com.phongbm.learningdagger2.base.BaseViewModel
import com.phongbm.learningdagger2.di.SalesInvoiceScope
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

@SalesInvoiceScope
class SalesInvoiceViewModel
@Inject
constructor() : BaseViewModel() {
}