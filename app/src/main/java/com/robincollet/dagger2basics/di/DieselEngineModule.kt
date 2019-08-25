package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.DieselEngine
import com.robincollet.dagger2basics.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideDieselEngine(): Engine = DieselEngine(horsePower)
}