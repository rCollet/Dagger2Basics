package com.robincollet.dagger2basics.di

import com.robincollet.dagger2basics.Car
import com.robincollet.dagger2basics.MainActivity
import com.robincollet.dagger2basics.di.scope.PerActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)
    fun getCar(): Car

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }
}