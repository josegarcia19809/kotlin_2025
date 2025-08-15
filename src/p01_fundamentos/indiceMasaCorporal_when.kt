package p01_fundamentos

import kotlin.math.pow

fun main() {
    println("Programa para calcular el IMC de una persona")

    print("Dame tu peso en kilogramos: ")
    val peso = readln().toDouble()

    print("Dame tu altura en metros: ")
    val altura = readln().toDouble()

    val imc = peso / altura.pow(2.0)

    when (imc) {
        in 0.0..18.4 -> println("Bajo peso")
        in 18.5..25.0 -> println("Peso óptimo")
        in 25.1..40.0 -> println("Sobrepeso")
    }

    println(".".repeat(100))

    when {
        imc < 18.5 -> println("Bajo peso")
        imc in 18.5..25.0 -> println("Peso óptimo")
        imc > 25.0 -> println("Sobrepeso")
    }

}