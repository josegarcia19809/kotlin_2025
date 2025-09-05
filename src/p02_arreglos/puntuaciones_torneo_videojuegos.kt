package p02_arreglos

// puntuaciones_torneo_videojuegos

fun main() {
    val jugadores = 5
    val rondas = 5

    val puntuaciones = arrayOf(
        intArrayOf(1500, 1600, 1550, 1480, 1620),
        intArrayOf(1400, 1450, 1380, 1420, 1460),
        intArrayOf(1700, 1650, 1680, 1720, 1690),
        intArrayOf(1300, 1350, 1320, 1380, 1400),
        intArrayOf(1550, 1580, 1570, 1590, 1600)
    )

    println("Puntuaciones de videojuegos 🎮")
    // Imprimir la tabla de puntuaciones

    println("Jugadores\tRonda 1\tRonda 2\tRonda 3\tRonda 4\tRonda 5\t")
    for (i in 0 until jugadores) {
        print("Jugador #${i + 1}\t   ")
        for (j in 0 until rondas) {
            print("${puntuaciones[i][j]}\t   ")
        }
        println()
    }

    println()
    println("Promedios 🎮")
    for (i in 0 until jugadores) {
        var sumaPuntos = 0.0
        for (j in 0 until rondas) {
            sumaPuntos += puntuaciones[i][j]
        }
        val promedio: Double = sumaPuntos / rondas;
        print("Jugador #${i + 1}: $promedio")
        println()
    }
}