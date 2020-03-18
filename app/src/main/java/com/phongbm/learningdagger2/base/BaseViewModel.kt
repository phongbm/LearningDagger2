package com.phongbm.learningdagger2.base

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * Created by PhongBM on 03/16/2020
 */

open class BaseViewModel : ViewModel() {
    init {
        Log.d(javaClass.name, "${javaClass.simpleName} was instantiated.")
    }

    override fun onCleared() {
        Log.d(javaClass.name, "${javaClass.simpleName} onCleared()...")
    }

}