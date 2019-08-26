package com.robincollet.dagger2basics

import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(engine: Engine, wheels: Wheels, private val driver: Driver) {

    init {
        engine.start()
    }

    fun drive() {
        println("$this Driving... with $driver")
    }

    @Inject
    fun initRemote(remote: Remote) {
        println("Remote initialized...")
    }
}

interface Engine {
    fun start()
}

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {
    override fun start() {
        println("Diesel engine started with $horsePower horse power")
    }

}

class PetrolEngine @Inject constructor(
    @Named("horsePower") private val horsePower: Int,
    @Named("engineCapacity") private val engineCapacity: Int
    ) : Engine {
    override fun start() {
        println("Petrol engine started with $horsePower horse power, $engineCapacity as engine capacity")
    }

}

class Remote @Inject constructor()

class Wheels(rims: Rims, tires: Tires) {
    init {
        println("Wheels are built...")
    }
}

class Tires
class Rims
