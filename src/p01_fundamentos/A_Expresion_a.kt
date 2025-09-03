package p01_fundamentos

import kotlin.math.pow
import kotlin.math.sqrt

// Elaborado por: José Luis García Morales, 2 septiembre 2025
fun main() {
    // SE LEEN LOS 3 VALORES DE ENTRADA
    print("Dame el valor de a: ")
    val a: Double = readln().toDouble()
    print("Dame el valor de b: ")
    val b: Double = readln().toDouble()
    print("Dame el valor de c: ")
    val c: Double = readln().toDouble()

    // Se calcula resultado <- RAIZ(b^3) - (4 * a * c)
    val resultado = sqrt(b.pow(3.0)) - (4 * a * c)

    // Se imprime en pantalla el valor de resultado
    println("Resultado: $resultado")
}