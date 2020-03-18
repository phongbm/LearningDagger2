package com.phongbm.learningdagger2.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

/**
 * Created by PhongBM on 03/18/2020
 */

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}