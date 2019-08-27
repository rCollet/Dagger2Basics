package com.robincollet.dagger2basics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robincollet.dagger2basics.di.DaggerActivityComponent
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as MainApplication).appComponent
        DaggerActivityComponent
            .builder()
            .appComponent(appComponent)
            .horsePower(150)
            .engineCapacity(1400)
            .build()
            .inject(this)

        car.drive()
        car2.drive()
    }
}
