package p04_funciones

fun calcularGalonesRequeridos(piesCuadrados: Double): Double {
    val piesCuadradosPorGalon = 115
    val galonesAOcupar = piesCuadrados / piesCuadradosPorGalon
    return galonesAOcupar
}

fun calcularHorasTrabajo(piesCuadrados: Double): Double {
    val horasTrabajoPorCada115 = 8.0
    val piesPorUnidad = 115
    val totalHoras = (piesCuadrados / piesPorUnidad) * horasTrabajoPorCada115
    return totalHoras
}

fun calcularCostoPintura(galonesAOcupar: Double, precioPorGalon: Double): Double {
    val costoTotal = galonesAOcupar * precioPorGalon
    return costoTotal
}

fun calcularCostoManoObra(horasTrabajo: Double): Double {
    val costoPorHora = 18.00
    val costoManoDeObra = horasTrabajo * costoPorHora
    return costoManoDeObra
}

fun calcularCostoTotal(costoPintura: Double, costoManoObra: Double): Double {
    val costoTotal = costoPintura + costoManoObra
    return costoTotal
}

fun main() {
    println("Trabajos profesionales de pintura🎨")

    print("¿Cuántas habitaciones se van a pintar? ")
    val habitaciones = readln().toInt()

    print("Precio por galón de pintura: ")
    val precioPorGalon = readln().toDouble()

    print("¿Cuántos pies cuadrados tiene cada habitación? ")
    val piesCuadradosPorHabitacion = readln().toDouble()

    val piesCuadradosTotal = piesCuadradosPorHabitacion * habitaciones

    val galoresRequeridos = calcularGalonesRequeridos(piesCuadradosTotal)
    val horasTrabajo = calcularHorasTrabajo(piesCuadradosTotal)
    val costoPintura = calcularCostoPintura(galoresRequeridos, precioPorGalon)
    val costoManoObra = calcularCostoManoObra(horasTrabajo)
    val costoTotal = costoManoObra + costoPintura

    imprimirLinea()
    println("Galones requeridos: ${String.format("%.2f", galoresRequeridos)}")
    println("Horas de trabajo: ${String.format("%.2f", horasTrabajo)}")
    println("Costo de la pintura: $${String.format("%.2f", costoPintura)}")
    println("Costo de la mano de obra: $${String.format("%.2f", costoManoObra)}")
    println("Costo total: $${String.format("%.2f", costoTotal)}")
}