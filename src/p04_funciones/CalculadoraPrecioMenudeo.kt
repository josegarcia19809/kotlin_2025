package p04_funciones

// CalculadoraPrecioMenudeo

fun calcularPrecioMenudeo(costoMayoreo: Double, porcentajeGanancia: Int): Double {
    val ganancia = costoMayoreo * porcentajeGanancia / 100.0
    val precioMenudeo = costoMayoreo + ganancia

    return precioMenudeo
}

fun main() {
    println("Calculando precios como todo un comerciante💰")

    print("Dame precio al mayoreo: ")
    val precioMayoreo = readln().toDouble()

    print("Dame el porcentaje de ganancia: ")
    val porcentajeGanancia = readln().toInt()

    val precioAlMenudeo = calcularPrecioMenudeo(precioMayoreo, porcentajeGanancia)
    println("El precio al menudeo debe ser de $%.2f pesos".format(precioAlMenudeo))
}

// println(calcularPrecioMenudeo(5.00, 100)) // 10.00
// println(calcularPrecioMenudeo(5.00, 50)) // 7.50