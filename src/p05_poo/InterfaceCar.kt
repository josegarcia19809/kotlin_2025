package p05_poo

import p04_funciones.imprimirLinea

interface Car {
    var speed: Int
    fun drive()
    fun park()
}

class BMW : Car {
    override var speed: Int = 250
    override fun drive() {
        println("BMW is driving at $speed kph")
    }

    override fun park() {
        println("BMW is parking")
    }
}

class CarFactory {
    fun provideCar(): Car {
        return BMW()
    }
}

fun main() {
    val factory = CarFactory()
    val myCar = factory.provideCar()

    imprimirLinea()
    myCar.speed = 250
    myCar.drive()
    myCar.park()
}