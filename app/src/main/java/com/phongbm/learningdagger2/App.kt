package com.phongbm.learningdagger2

import android.app.Application
import com.phongbm.learningdagger2.di.AppComponent
import com.phongbm.learningdagger2.di.DaggerAppComponent
import com.phongbm.learningdagger2.view.task.di.TaskMgtComponent

/**
 * Created by PhongBM on 03/16/2020
 */

class App : Application() {
    companion object {
        lateinit var instance: App
            private set
    }

    lateinit var appComponent: AppComponent
        private set

    var taskMgtComponent: TaskMgtComponent? = null

    override fun onCreate() {
        super.onCreate()
        instance = this

        appComponent = DaggerAppComponent.create()
    }

}