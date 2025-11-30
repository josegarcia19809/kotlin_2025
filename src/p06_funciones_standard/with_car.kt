package p06_funciones_standard

private class Car {
    var speed = 1.0
    fun drive() {
        println("Car is driving at $speed")
    }
}

fun main() {
    with(Car()) {
        speed = 80.0
        drive()
        println("Car is driving")
    }
}