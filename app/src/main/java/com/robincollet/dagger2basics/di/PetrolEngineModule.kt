package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Engine
import com.robincollet.dagger2basics.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine): Engine
}