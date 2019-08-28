package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Car
import com.robincollet.dagger2basics.MainActivity
import com.robincollet.dagger2basics.di.scope.PerActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
    fun getCar(): Car

    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance @Named("horsePower") horsePower: Int,
                   @BindsInstance @Named("engineCapacity") engineCapacity: Int): ActivityComponent
    }
}