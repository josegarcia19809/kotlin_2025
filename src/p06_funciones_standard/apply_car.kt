package p06_funciones_standard

class MyCar {
    var speed: Double = 0.0
    var color: String = ""
    fun startCar() {
        println("Starting the car, speed is $speed, color is $color")
    }
}

fun main() {
    val myCar = MyCar().apply {
        speed = 50.0
        color = "red"
        startCar()
    }
    println("Speed: ${myCar.speed}")
}