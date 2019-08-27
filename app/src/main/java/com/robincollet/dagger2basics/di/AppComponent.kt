package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getDriver(): Driver
}