package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Car
import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {

    fun getCar(): Car
}