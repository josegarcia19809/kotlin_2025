package p10_repaso

import p04_funciones.imprimirLinea

fun main() {
    for (noLista in 1..5) {
        println(".".repeat(100) + noLista)
        calcularCalorias(noLista)
        imprimirLinea()
        porcentajesPasajeros(noLista)

        imprimirLinea()
        puntuaciones(noLista)

        imprimirLinea()
        pruebaCargosGamer(noLista)
    }
}

fun calcularCalorias(lista: Int) {
    val noLista = lista
    val noRebanadas = noLista * noLista
    val rebanadasExtra = noLista + 3
    val totalRebanadas = noRebanadas + (rebanadasExtra * 2)

    val porcionesPorPizza = 8
    val caloriasPorPorcion = 250

    val caloriasPorPizza = porcionesPorPizza * caloriasPorPorcion
    val caloriasPorRebanada = caloriasPorPizza / totalRebanadas

    val rebanadasConsumidas = noRebanadas + 4
    val caloriasConsumidas = caloriasPorRebanada * rebanadasConsumidas

    println("Calorías por rebanada: $caloriasPorRebanada")
    println("Rebanadas consumidas: $rebanadasConsumidas")
    println("Calorías consumidas: $caloriasConsumidas")
}

fun porcentajesPasajeros(lista: Int) {
    val noLista = lista
    val pasajerosLineaA = noLista + 8 * 20
    val pasajerosLineaB = noLista + 12 * 20

    val totalPasajeros = pasajerosLineaA + pasajerosLineaB

    val porcentajeLineaA = pasajerosLineaA * 100.0 / totalPasajeros
    val porcentajeLineaB = pasajerosLineaB * 100.0 / totalPasajeros

    println("Porcentaje Linea A: $porcentajeLineaA")
    println("Porcentaje Linea B: $porcentajeLineaB")
}

class CargosGamer(
    private var saldoCuenta: Double,
    private val juegosDescargados: Int
) {
    fun obtenerCobroTotal(): Double {
        // Tarifa base del servicio
        val tarifaBase = 15.0
        saldoCuenta -= tarifaBase

        // Cobro según cantidad de juegos descargados
        val costoPorJuegos = if (juegosDescargados < 20) {
            juegosDescargados * 1.50
        } else {
            juegosDescargados * 1.20
        }

        saldoCuenta -= costoPorJuegos
        val cargoTotal = tarifaBase + costoPorJuegos
        return cargoTotal
    }

    fun obtenerSaldoActual(): Double {
        return saldoCuenta
    }
}


fun pruebaCargosGamer(lista: Int) {
    val noLista = lista
    val saldoInicial = noLista * 50.0       // saldo inicial del usuario
    val juegosDescargados = noLista * 2   // cantidad de juegos descargados según noLista

    val cargos = CargosGamer(saldoInicial, juegosDescargados)

    val saldoAntes = cargos.obtenerSaldoActual()
    val cargosTotales = cargos.obtenerCobroTotal()
    val saldoDespues = cargos.obtenerSaldoActual()

    println("Saldo antes: $saldoAntes")
    println("Cargos totales: $cargosTotales")
    println("Saldo despues: $saldoDespues")
}

fun puntuaciones(lista: Int) {
    val noLista = lista

    val calificaciones = listOf(7.5, 9.0, 6.0, 10.0, 8.5, 5.0, 9.5, 4.0, 3.5 + noLista)
    var sumaCalificaciones = 0.0

    for (cal in calificaciones) {
        sumaCalificaciones += cal
    }

    var tareasReprobadas = 0
    for (cal in calificaciones) {
        if (cal <= 8.0) {
            tareasReprobadas += 1
        }
    }

    println("Total calificaciones: $sumaCalificaciones")
    println("Tareas reprobadas: $tareasReprobadas")
}