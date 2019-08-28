package com.robincollet.dagger2basics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MainApplication)
            .appComponent
            .getActivityComponentFactory()
            .create(140, 100)
            .inject(this)

        car.drive()
        car2.drive()
    }
}
