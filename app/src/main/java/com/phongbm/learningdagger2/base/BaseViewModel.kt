package com.phongbm.learningdagger2.base

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

/**
 * Created by PhongBM on 03/16/2020
 */

open class BaseViewModel(application: Application) : AndroidViewModel(application) {
    init {
        Log.d(javaClass.name, "${javaClass.simpleName} was instantiated.")
    }

    override fun onCleared() {
        Log.d(javaClass.name, "onCleared()...")
        super.onCleared()
    }

}