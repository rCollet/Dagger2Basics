package com.robincollet.dagger2basics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robincollet.dagger2basics.di.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MainApplication).appComponent.getActivityComponent(
            DieselEngineModule(140)
        ).inject(this)

        car.drive()
        car2.drive()
    }
}
