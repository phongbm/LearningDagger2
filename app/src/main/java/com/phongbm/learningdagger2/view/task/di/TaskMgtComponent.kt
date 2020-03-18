package com.phongbm.learningdagger2.view.task.di

import com.phongbm.learningdagger2.view.task.fragment.TaskDetailFragment
import com.phongbm.learningdagger2.view.task.fragment.TaskMgtFragment
import dagger.Subcomponent

/**
 * Created by PhongBM on 03/18/2020
 */

@TaskMgtScope
@Subcomponent(modules = [TaskMgtModule::class])
interface TaskMgtComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): TaskMgtComponent
    }

    fun inject(taskMgtFragment: TaskMgtFragment)
    fun inject(taskDetailFragment: TaskDetailFragment)

}