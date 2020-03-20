package com.phongbm.learningdagger2.di

import com.phongbm.learningdagger2.architecture.data.di.LocalDataSourceModule
import com.phongbm.learningdagger2.architecture.data.di.NetworkModule
import com.phongbm.learningdagger2.architecture.data.di.RepositoryModule
import com.phongbm.learningdagger2.di.viewmodel.ViewModelModule
import com.phongbm.learningdagger2.view.fragment.LoginFragment
import com.phongbm.learningdagger2.view.fragment.ProfileEditFragment
import com.phongbm.learningdagger2.view.fragment.ProfileFragment
import com.phongbm.learningdagger2.view.invoice.di.SalesInvoiceComponent
import com.phongbm.learningdagger2.view.task.di.TaskMgtComponent
import dagger.Component
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/16/2020
 */

@Singleton
@Component(
        modules = [
            AppModule::class,
            AppSubcomponentModule::class,
            ViewModelModule::class,
            RepositoryModule::class,
            LocalDataSourceModule::class,
            NetworkModule::class
        ]
)
interface AppComponent {
    fun inject(loginFragment: LoginFragment)
    fun inject(profileFragment: ProfileFragment)
    fun inject(profileEditFragment: ProfileEditFragment)

    fun salesInvoiceComponent(): SalesInvoiceComponent.Factory
    fun taskMgtComponent(): TaskMgtComponent.Factory

}