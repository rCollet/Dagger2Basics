package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.DieselEngine
import com.robincollet.dagger2basics.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine
}