package com.robincollet.dagger2basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robincollet.dagger2basics.di.CarComponent
import com.robincollet.dagger2basics.di.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.create()
        car = carComponent.getCar()

        car.drive()
    }
}
