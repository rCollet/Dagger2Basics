package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Car
import com.robincollet.dagger2basics.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class, DriverModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)

    fun getCar(): Car

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): CarComponent
    }
}