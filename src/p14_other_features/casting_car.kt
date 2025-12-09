package p14_other_features

open class Car {}

class BMW : Car() {
    fun drive() {
        println("Driving my BMW.")
    }
}

fun getCar(): Car = BMW()

fun main() {
    val myCar = getCar()

    val bmwCar = myCar as? BMW

    bmwCar?.drive()
}