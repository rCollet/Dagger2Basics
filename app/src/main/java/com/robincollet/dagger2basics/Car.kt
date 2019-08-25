package com.robincollet.dagger2basics

import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {

    init {
        engine.start()
    }

    fun drive() {
        println("Driving...")
    }

    @Inject
    fun initRemote(remote: Remote) {
        println("Remote initialized...")
    }
}



interface Engine {
    fun start()
}

class DieselEngine @Inject constructor() : Engine {
    override fun start() {
        println("Diesel engine started")
    }

}
class PetrolEngine @Inject constructor() : Engine {
    override fun start() {
        println("Petrol engine started")
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
