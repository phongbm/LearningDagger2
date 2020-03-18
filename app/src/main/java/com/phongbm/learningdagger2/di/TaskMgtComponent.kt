package com.phongbm.learningdagger2.di

import com.phongbm.learningdagger2.view.task.TaskDetailFragment
import com.phongbm.learningdagger2.view.task.TaskMgtFragment
import dagger.Subcomponent
import javax.inject.Scope

/**
 * Created by PhongBM on 03/18/2020
 */

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class TaskMgtScope

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