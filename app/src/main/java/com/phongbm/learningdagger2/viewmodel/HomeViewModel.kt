package com.phongbm.learningdagger2.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

/**
 * Created by PhongBM on 03/16/2020
 */

class HomeViewModel(application: Application) : AndroidViewModel(application) {
    init {
        Log.d(javaClass.name, "${javaClass.simpleName} was instantiated.")
    }

    override fun onCleared() {
        Log.d(javaClass.name, "${javaClass.simpleName} onCleared()...")
        super.onCleared()
    }

}