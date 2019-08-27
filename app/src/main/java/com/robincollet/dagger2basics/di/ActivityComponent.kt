package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Car
import com.robincollet.dagger2basics.MainActivity
import com.robincollet.dagger2basics.di.scope.PerActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
    fun getCar(): Car

    /* @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }*/
}