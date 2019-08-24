package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Rims
import com.robincollet.dagger2basics.Tires
import com.robincollet.dagger2basics.Wheels
import dagger.Module
import dagger.Provides

@Module
object WheelsModule {
    @JvmStatic
    @Provides
    fun provideWheels(tires: Tires, rims: Rims): Wheels = Wheels(rims, tires)

    @JvmStatic
    @Provides
    fun provideRims(): Rims = Rims()

    @JvmStatic
    @Provides
    fun provideTires(): Tires = Tires()
}