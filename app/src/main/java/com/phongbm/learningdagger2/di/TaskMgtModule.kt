package com.phongbm.learningdagger2.di

import androidx.lifecycle.ViewModel
import com.phongbm.learningdagger2.viewmodel.TaskMgtViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by PhongBM on 03/18/2020
 */

@Module
abstract class TaskMgtModule {
    @Binds
    @IntoMap
    @ViewModelKey(TaskMgtViewModel::class)
    abstract fun bindViewModel(viewModel: TaskMgtViewModel): ViewModel

}