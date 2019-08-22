package com.robincollet.dagger2basics

import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {
    fun drive() {
        println("Driving...")
    }
}


class Engine @Inject constructor()
class Wheels @Inject constructor()