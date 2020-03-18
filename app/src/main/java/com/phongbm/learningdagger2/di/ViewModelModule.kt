package com.phongbm.learningdagger2.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.phongbm.learningdagger2.viewmodel.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by PhongBM on 03/18/2020
 */

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindViewModel(loginViewModel: LoginViewModel): ViewModel

}