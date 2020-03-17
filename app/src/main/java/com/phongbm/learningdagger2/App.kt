package com.phongbm.learningdagger2

import android.app.Application
import com.phongbm.learningdagger2.dagger.DaggerAppComponent

/**
 * Created by PhongBM on 03/16/2020
 */

class App : Application() {
    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        val appComponent = DaggerAppComponent.create()
    }

}