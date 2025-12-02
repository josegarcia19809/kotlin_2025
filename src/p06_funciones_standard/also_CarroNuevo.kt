package p06_funciones_standard

class CarroNuevo {
    fun buildCar() {
        println("Building carro nuevo")
    }
}

fun main() {
    CarroNuevo().apply {
        buildCar()
    }
        .also {
            println("LOG: Building the car")
            println("LOG: Sending a email to the police that car has been built")
        }
}