package p06_funciones_standard

private class NewCarro {
    var speed = 0
    fun drive() {
        println("Car is driving at $speed")
    }
}

fun main() {
    NewCarro().apply {
        speed = 80
        drive()
    }.also { car ->
        println("Car is running")
        println("Car speed is ${car.speed}")
    }
}