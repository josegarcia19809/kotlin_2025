package p07_other_classes

class Car3 {
    private val engine = Engine()
    var speed = 100
    fun drive() {
        println("Driving at speed: $speed")
        engine.run()
    }

    inner class Engine {
        val rpm = 1000
        fun run() {
            println("Running in range $rpm")
            this@Car3.speed = 50
        }
    }
}

fun main() {
    var car = Car3()
    car.drive()
}