package p06_funciones_standard

private class NewCar {
    var speed = 0
    fun drive() {
        println("Car is driving at $speed")
    }
}

fun main() {
    val newCar = NewCar().run {
        speed = 70
        drive()
        println("Car is driving")
        this
    }
    println("Speed: ${newCar.speed}")
}