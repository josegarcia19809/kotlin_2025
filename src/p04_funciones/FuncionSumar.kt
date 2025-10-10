package p04_funciones

fun sumar(numero1: Double, numero2: Double){
    val suma: Double = numero1 + numero2
    println("La suma es $suma")
}

fun main() {
    sumar(5.0, 7.0) // 12
    sumar(2.5, 3.5) // 6
    sumar(3.0, 2.0) // 5
}