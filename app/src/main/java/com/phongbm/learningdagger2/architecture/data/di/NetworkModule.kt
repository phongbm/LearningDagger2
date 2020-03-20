package com.phongbm.learningdagger2.architecture.data.di

import com.phongbm.learningdagger2.architecture.data.source.remote.api.Client
import com.phongbm.learningdagger2.architecture.data.source.remote.api.SalesApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/20/2020
 */

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit(client: Client): Retrofit {
        return client.build()
    }

    @Singleton
    @Provides
    fun provideSalesApi(retrofit: Retrofit): SalesApi {
        return retrofit.create(SalesApi::class.java)
    }

}