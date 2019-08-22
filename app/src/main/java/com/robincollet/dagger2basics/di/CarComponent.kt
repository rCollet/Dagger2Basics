package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Car
import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}