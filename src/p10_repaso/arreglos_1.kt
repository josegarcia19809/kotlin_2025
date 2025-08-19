package p10_repaso

import java.math.BigDecimal

fun main() {

    // ------------------ 1. Arreglos de ejemplo (cotidianos) ------------------
    val nombres = arrayOf("Ana", "Luis", "María", "José")

    val numerosLargos1 = arrayOf(1L, 2L, 3L)                 // Long
    val numerosLargos2 = arrayOf<Long>(1, 2, 3, 4)           // Long
    val numerosEnteros = arrayOf(1, 2, 3, 4)                 // Int

    println(numerosLargos1 is Array<Long>)   // true
    println(numerosLargos2 is Array<Long>)   // true
    println(numerosEnteros is Array<Int>)    // true
    println()
    println(".".repeat(100))
    // ------------------ 2. Arreglos creados con inicialización ------------------
    val numerosPares = Array(16) { indice -> indice * 2 }         // 0, 2, 4, ...
    val numerosDel1Al100000 = Array(100000) { i -> i + 1 }        // 1..100000
    val cienCeros = Array(100) { 0 }                              // 100 ceros

    // ------------------ 3. Reasignación de arreglos ------------------
    var numeros: Array<Int>
    numeros = arrayOf(1, 2, 3, 4)
    for (valor in numeros) {
        print("$valor ")
    }
    println()
    println(".".repeat(100))

    numeros = Array(6) { i -> (i + 1) * 10 }     // 10, 20, 30, 40, 50, 60
    for (valor in numeros) {
        print("$valor ")
    }
    println()
    println(".".repeat(100))

    // ------------------ 4. Arreglo mixto ------------------
    val datosMixtos = arrayOf("hola", 22, BigDecimal("10.5"), 'ñ')
    for (elemento in datosMixtos) {
        print("$elemento ")
    }
    println()
    println(".".repeat(100))

    println(datosMixtos.isArrayOf<Any>())  // true

    // ------------------ 5. Arreglos primitivos (IntArray) ------------------
    val calificaciones = intArrayOf(95, 88, 73, 100, 67)
    println("📊 Calificaciones:")
    for (calificacion in calificaciones) {
        print("$calificacion ")
    }
    println()
    println(".".repeat(100))

    val otrosEnteros = IntArray(5)   // por defecto: 0,0,0,0,0
    println("🔢 Otros enteros inicializados en cero:")
    for (valor in otrosEnteros) {
        print("$valor ")
    }
    println()
    println(".".repeat(100))

    // ------------------ 6. Conversiones entre Array<Int> e IntArray ------------------
    val numerosParesComoIntArray = numerosPares.toIntArray()   // Array<Int> -> IntArray
    println("➕ Números pares convertidos a IntArray:")
    for (numero in numerosParesComoIntArray) {
        print("$numero ")
    }
    println()
    println(".".repeat(100))

    val calificacionesComoArray = calificaciones.toTypedArray()   // IntArray -> Array<Int>
    println("📋 Calificaciones convertidas a Array<Int>:")
    for (calificacion in calificacionesComoArray) {
        print("$calificacion ")
    }
    println()
    println(".".repeat(100))

}
