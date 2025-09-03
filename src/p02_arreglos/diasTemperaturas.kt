package p02_arreglos

// diasTemperaturas

fun main() {
    val ciudades = 3
    val dias = 7

    val temperaturas = arrayOf(
        doubleArrayOf(22.0, 24.0, 23.0, 21.0, 25.0, 26.0, 24.0),
        doubleArrayOf(18.0, 19.0, 20.0, 22.0, 21.0, 19.0, 20.0),
        doubleArrayOf(30.0, 31.0, 29.0, 28.0, 32.0, 33.0, 31.0)
    )

    // Imprimir las temperaturas en pantalla en formato de tabla
    val diasSemana = arrayOf(
        "Lunes", "Martes", "Miérc", "Jueves", "Viernes", "Sábado", "Domingo"
    )
    print("\t\t")
    for (dia in 0 until diasSemana.size) {
        print("\t\t${diasSemana[dia]}")
    }
    println()

    for (i in 0 until ciudades) {
        print("Ciudad ${i + 1}:")
        for (j in 0 until dias) {
            print("\t\t${temperaturas[i][j]}")
        }
        println()
    }
    // Sacar el promedio
    var totalTemperaturas = 0.0
    for (i in 0 until ciudades) {
        for (j in 0 until dias) {
            totalTemperaturas += temperaturas[i][j]
        }
    }

    val promedio = totalTemperaturas / (ciudades * dias)
    println("El promedio de las temperaturas es $promedio")
}