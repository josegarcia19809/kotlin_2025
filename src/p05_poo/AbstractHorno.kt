package p05_poo

import p04_funciones.imprimirLinea

abstract class Horno(tipo: String) {

    val velocidad = 100
    open val temperatura = 70

    abstract fun cocinar()
}

class Bosch(val tipo: String) : Horno(tipo) {

    override val temperatura = 120

    fun obtenerVelocidad() {
        println(("$tipo tiene una velocidad promedio de $velocidad "))
    }

    fun obtenerTemperatura() {
        println(("$tipo tiene una temperatura máxima estándar de $temperatura ºC"))
    }

    override fun cocinar() {
        obtenerVelocidad()
        obtenerTemperatura()
        println("$tipo tiene funcion para cocinar")
    }
}

class Rostizador(val tipo: String) : Horno(tipo) {
    fun obtenerVelocidad() {
        println(("$tipo tiene una velocidad promedio de $velocidad "))
    }

    fun obtenerTemperatura() {
        println(("$tipo tiene una temperatura promedio de $temperatura ºC"))
    }

    override fun cocinar() {
        obtenerVelocidad()
        obtenerTemperatura()
        println("$tipo NO tiene funcion para cocinar, pero puede asar")
    }
}

fun main() {
    val rostizador: Horno = Rostizador("Rostizador")
    rostizador.cocinar()

    imprimirLinea()
    val bosch: Horno = Bosch("Bosch")
    bosch.cocinar()
}