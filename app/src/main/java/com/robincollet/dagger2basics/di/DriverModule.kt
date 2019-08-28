package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(private val name: String) {

    @Singleton
    @Provides
    fun provideDriver(): Driver = Driver(name)
}