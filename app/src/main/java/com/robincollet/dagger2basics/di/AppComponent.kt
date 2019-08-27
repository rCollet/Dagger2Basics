package com.robincollet.dagger2basics.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponent(dieselEngineModule: DieselEngineModule): ActivityComponent
}