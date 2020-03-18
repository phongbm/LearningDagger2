package com.phongbm.learningdagger2.viewmodel

import com.phongbm.learningdagger2.base.BaseViewModel
import com.phongbm.learningdagger2.view.task.di.TaskMgtScope
import java.util.*
import javax.inject.Inject

/**
 * Created by PhongBM on 03/18/2020
 */

@TaskMgtScope
class TaskMgtViewModel
@Inject
constructor() : BaseViewModel() {
    var number = 0

    fun generateNumber() {
        number = Random().nextInt()
    }

}