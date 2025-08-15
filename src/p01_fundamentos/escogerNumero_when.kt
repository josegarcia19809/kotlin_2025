package p01_fundamentos

/*
100 -> C
200 -> CC
300 -> CCC
when
* */

fun main() {
    println("Escribe un número (100, 200, 300): ")
    val numero = readln().toInt()

    when (numero) {
        100 -> println("C")
        200 -> println("CC")
        300 -> println("CCC")
        else -> println("No válido")
    }
}