package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.MainActivity
import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)
}