package p02_arreglos

fun main() {
    val distancias = DoubleArray(100)
    // llenarlo con números aleatorios

    for (i in distancias.indices) {
        distancias[i] = (Math.random() * 1000) + 1
    }

    // Imprimir con un for mejorado
    var i = 1
    for (distancia in distancias) {
        print("%4.1f\t".format(distancia))
        if (i % 5 == 0) {
            println()
        }
        i++
    }
}