package p06_funciones_standard

class Laptop {
    fun turnOff() {
        println("Laptop turn off")
    }

    fun turnOn() {
        println("Laptop turn on")
    }
}

fun main() {
    Laptop().run {
        turnOff()
        turnOn()
    }
}