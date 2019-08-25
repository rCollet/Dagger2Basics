package com.robincollet.dagger2basics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robincollet.dagger2basics.di.CarComponent
import com.robincollet.dagger2basics.di.DaggerCarComponent
import com.robincollet.dagger2basics.di.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dieselEngineModule = DieselEngineModule(100)
        val component = DaggerCarComponent.builder().dieselEngineModule(dieselEngineModule).build()
        component.inject(this)

        car.drive()
    }
}
