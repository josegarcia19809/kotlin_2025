package p02_arreglos

fun main() {
    val numeroMaximo = 100

    val numeros = Array(numeroMaximo) { i -> 0 }
    var n = 0
    var sumaTotal = 0.0
    println("Introduce hasta $numeroMaximo números. Termina con cero: ")
    var valor = readln().toInt()
    while (valor != 0) {
        numeros[n] = valor
        valor = readln().toInt()
        n++
    }

    if (n == 0) {
        println("No se introdujeron números")
        return
    }

    // Sacar la suma
    // 0 a n-1
    for (i in 0..<n) {
        sumaTotal += numeros[i]
    }

    println("Cantidad de números: $n")
    println("La suma es ${"%1.0f".format(sumaTotal)}")

    // Sacar el promedio
    val promedio = sumaTotal / n
    println("El promedio es ${"%3.2f".format(promedio)}")

    println("Números y su diferencia del promedio")
    for (i in 0 until n) {
        print("${"%4d".format(numeros[i])}\t")
        print("${"%6.2f".format(numeros[i] - promedio)}\t")
        println()
    }

}