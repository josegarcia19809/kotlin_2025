package p02_arreglos

fun main() {
    val puntuaciones = intArrayOf(7, 8, 9, 10, 11)

    println("Arreglo original: ${puntuaciones.joinToString(", ")}")

    ++puntuaciones[2] // Pre-incremento en 1 del elemento 2 del arreglo
    puntuaciones[4]++ // Post-incremento en 1 del elemento 4 del arreglo


    // Después de los incrementos
    for (i in 0..4) {
        println(puntuaciones[i])
    }

}