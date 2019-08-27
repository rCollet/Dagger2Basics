package com.robincollet.dagger2basics

import android.app.Application
import com.robincollet.dagger2basics.di.AppComponent
import com.robincollet.dagger2basics.di.DaggerAppComponent

class MainApplication : Application() {

    lateinit var appComponent: AppComponent
        private set


    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}