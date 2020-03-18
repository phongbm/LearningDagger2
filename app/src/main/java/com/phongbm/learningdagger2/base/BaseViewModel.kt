package com.phongbm.learningdagger2.base

import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.phongbm.learningdagger2.App

/**
 * Created by PhongBM on 03/16/2020
 */

open class BaseViewModel : AndroidViewModel(App.instance) {
    init {
        Log.d(javaClass.name, "${javaClass.simpleName} was instantiated.")
    }

    override fun onCleared() {
        Log.d(javaClass.name, "${javaClass.simpleName} onCleared()...")
        super.onCleared()
    }

}