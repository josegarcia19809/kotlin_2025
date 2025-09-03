package p02_arreglos

// VentasDivisionTrimestre

fun main() {
    println("Programa para calcular total de ventas de una empresa con 3 divisiones")
    val divisiones = 3
    val trimestres = 4

    var ventasTotales: Double = 0.0

    val ventas = Array(divisiones) {
        DoubleArray(trimestres)
    }

    // Captura de ventas
    for (i in 0 until divisiones) {
        for (j in 0 until trimestres) {
            print("Dame ventas de la división ${i + 1} del trimestre ${j + 1}: ")
            ventas[i][j] = readln().toDouble()
        }
    }

    // Calcular las ventas totales
    for (i in 0 until divisiones) {
        for (j in 0 until trimestres) {
            ventasTotales += ventas[i][j]
        }
    }
    println("Las ventas totales son $%.2f".format(ventasTotales))

    // Imprimir la tabla
    println("\t\t\tTRIMEST 1\t\tTRIMEST 2\t\tTRIMEST 3\t\tTRIMEST 4")
    for (i in 0 until divisiones) {
        print("DIVISIóN ${i + 1}\t")
        for (j in 0 until trimestres) {
            print("$%.2f\t\t".format(ventas[i][j]))
        }
        println()
    }
}