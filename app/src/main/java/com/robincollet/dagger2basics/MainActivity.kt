package com.robincollet.dagger2basics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robincollet.dagger2basics.di.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var car: Car
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent
            .builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()
        car = component.getCar()

        val component2 = DaggerCarComponent
            .builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()
        component2.inject(this)
        car2 = component2.getCar()

        car.drive()
        car2.drive()
    }
}
