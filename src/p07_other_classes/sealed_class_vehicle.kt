package p07_other_classes

abstract class Vehicle

sealed class CarX : Vehicle()
sealed class BicycleX : Vehicle()

class BMW : CarX()
class Bennotto : BicycleX()

fun getVehicle(tipo: Int): Vehicle {
    return when (tipo) {
        1 -> BMW()
        2 -> Bennotto()
        else -> BMW()
    }
}

fun main() {
    val vehicle = getVehicle(2)

    when (vehicle) {
        is CarX -> println("Car is faster")
        is BicycleX -> println("Bicycle is more healthy")
    }
}