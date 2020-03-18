package com.phongbm.learningdagger2.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.phongbm.learningdagger2.di.TaskMgtScope
import java.util.*
import javax.inject.Inject

/**
 * Created by PhongBM on 03/18/2020
 */

@TaskMgtScope
class TaskMgtViewModel
@Inject
constructor() : ViewModel() {
    var number = 0

    init {
        Log.d(javaClass.name, "${javaClass.simpleName} was instantiated.")
    }

    override fun onCleared() {
        Log.d(javaClass.name, "${javaClass.simpleName} onCleared()...")
        super.onCleared()
    }

    fun generateNumber() {
        number = Random().nextInt()
    }

}