package com.phongbm.learningdagger2.di

import com.phongbm.learningdagger2.view.fragment.LoginFragment
import dagger.Component
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/16/2020
 */

@Singleton
@Component(
        modules = [
            AppModule::class
        ]
)
interface AppComponent {
    fun inject(loginFragment: LoginFragment)

}