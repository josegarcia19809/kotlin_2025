package p02_arreglos

fun main() {
    val temperaturas = doubleArrayOf(3.4, 5.8, 20.0, 40.0)

    val longitudArreglo = temperaturas.size
    println("Tamaño del arreglo: $longitudArreglo")
    println("-".repeat(100))

    // Usar los índices del arreglo para saber hasta dónde llegará el for
    for (i in temperaturas.indices) {
        println("#${i}: ${temperaturas[i]}")
    }

}