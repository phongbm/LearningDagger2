package com.phongbm.learningdagger2.di

import com.phongbm.learningdagger2.data.remote.UserRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/17/2020
 */

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideUserRemoteDataSource() = UserRemoteDataSource

}