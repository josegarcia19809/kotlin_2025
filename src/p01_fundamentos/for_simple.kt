package p01_fundamentos

// for_simple

fun main() {
    // Mostrar los números del 1 al 5
    println("Números del 1 al 5")
    for (num in 1..5) {
        print("$num ")
    }
    println()
    println(".".repeat(100))

    // Números impares
    println("Números impares del 1 al 9")
    for (num in 1..9 step 2) {
        print("$num ")
    }
    println()
    println(".".repeat(100))

    // Imprimir una lista de nombres
    println("Lista de nombres")
    for (nombre in listOf("Carlos", "José", "Lulú")) {
        print("$nombre ")
    }
    println()
    println(".".repeat(100))

    // Alternativas con forEach
    println("Números impares del 1 al 9")
    (1..9 step 2).forEach { print("$it ") }
    println()
    println(".".repeat(100))

    println("Imprimir lista de nombres")
    listOf("Carlos", "José", "Lulú")
        .forEach { print("$it ") }
    println()
    println(".".repeat(100))

    // Uso de rangos exclusivos (excluir)
    println("Contar del 0 al 4")
    for (num in 0 until 5) {
        print("$num ")
    }
    println()
    println(".".repeat(100))

    // Equivalente con arreglo explícito (implicito)
    for (num in arrayOf(0, 1, 2, 3, 4)) {
        print("$num ")
    }
    println()
    println(".".repeat(100))

    // Mostrar la frase "Hello world" 5 veces
    for (i in 1..5) {
        println("Hello world")
    }
}