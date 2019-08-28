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

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): ActivityComponent
    }
}