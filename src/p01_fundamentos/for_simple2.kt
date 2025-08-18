package p01_fundamentos

// for_simple2

fun main() {
    // Imprimir los números del 0 al 9 (inclusivo) ..
    println("Números del 0 al 9")
    for (num in 0..9) {
        print("$num ")
    }
    println()
    println(".".repeat(100))

    // Imprimir los números del 10 al 20 (inclusivo) ..
    println("Números del 10 al 20")
    for (num in 10..20) {
        print("$num ")
    }
    println()
    println(".".repeat(100))

    // Mostrar un mensaje 5 veces (exclusivo) until
    for (i in 0 until 5) {
        println("Bienvenidos")
    }
    println()
    println(".".repeat(100))

    // Imprimir los números del 0 al 100 de 2 en 2 (inclusivo)
    println("Números del 0 al 100 de 2 en 2")
    for (num in 0..100 step 2) {
        print("$num\t")
        if (num % 20 == 0) println()
    }
    println()
    println(".".repeat(100))

    // Imprimir de forma descendente
    println("Numeros del 10 al 1")
    for (x in 10 downTo 1) {
        print("$x ")
    }
    println()
    println(".".repeat(100))

    println("Números del 500 al 0 de 100 en 100")
    for (i in 500 downTo 0 step 100) {
        print("$i ")
    }

}