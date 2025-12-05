package p07_other_classes

class AirPlane {
    private inner class Engine(val name: String) {
        fun startEngine() {
            println("Engine $name started")
        }
    }

    private val engine1 = Engine("Engine1")
    private val engine2 = Engine("Engine1")

    fun takeOff() {
        println("Getting ready for take off")
        engine1.startEngine()
        engine2.startEngine()
        println("Taking off")
    }
}

fun main() {
    val myPlane = AirPlane()
    myPlane.takeOff()
}