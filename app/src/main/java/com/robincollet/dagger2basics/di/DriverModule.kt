package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DriverModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideDriver(): Driver = Driver()
}