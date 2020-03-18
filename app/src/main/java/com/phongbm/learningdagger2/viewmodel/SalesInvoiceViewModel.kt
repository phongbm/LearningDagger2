package com.phongbm.learningdagger2.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.phongbm.learningdagger2.view.invoice.di.SalesInvoiceScope
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

@SalesInvoiceScope
class SalesInvoiceViewModel
@Inject
constructor() : ViewModel() {
    init {
        Log.d(javaClass.name, "${javaClass.simpleName} was instantiated.")
    }

    override fun onCleared() {
        Log.d(javaClass.name, "${javaClass.simpleName} onCleared()...")
    }

}