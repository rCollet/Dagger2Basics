package com.robincollet.dagger2basics

import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {
    fun drive() {
        println("Driving...")
    }

    @Inject
    fun initRemote(remote: Remote) {
        println("Remote initialized...")
    }
}


class Remote @Inject constructor()
class Engine @Inject constructor()
class Wheels(rims: Rims, tires: Tires) {
    init {
        println("Wheels are built...")
    }
}
class Tires
class Rims
