package p04_funciones

/*
Escribe un programa que solicite al usuario, ingresar los costos mensuales de los
siguientes gastos incurridos por operar su automóvil: pago de la mensualidad,
seguro, gasolina, aceite, llantas y mantenimiento.
El programa luego debe mostrar el costo mensual total de estos gastos
y el costo anual total de estos gastos.
Escribir una función para calcular e imprimir esos costos.
 */

fun calcularGastosIncurridos(
    mensualidad: Double, seguro: Double, gasolina: Double,
    aceite: Double, llantas: Double, mantenimiento: Double
) {
    val costoTotalMensual = mensualidad + seguro + gasolina +
            aceite + llantas + mantenimiento
    val costoTotalAnual = costoTotalMensual * 12

    println("El costo mensual es de $%.2f".format(costoTotalMensual))
    println("El costo anual es de $%.2f".format(costoTotalAnual))
}

fun main() {
    println("💲Calculando gastos del automóvil🚗")

    print("Dime los gastos de la mensualidad: ")
    val mensualidad = readln().toDouble()

    print("Dime los gastos del seguro: ")
    val seguro = readln().toDouble()

    print("Dime los gastos de la gasolina: ")
    val gasolina = readln().toDouble()

    print("Dime los gastos del aceite: ")
    val aceite = readln().toDouble()

    print("Dime los gastos de las llantas: ")
    val llantas = readln().toDouble()

    print("Dime los gastos del mantenimiento: ")
    val mantenimiento = readln().toDouble()

    calcularGastosIncurridos(mensualidad, seguro, gasolina, aceite,
        llantas, mantenimiento)
}

/*
* 💲Calculando gastos del automóvil🚗
Dime los gastos de la mensualidad: 3000
Dime los gastos del seguro: 100
Dime los gastos de la gasolina: 800
Dime los gastos del aceite: 12
Dime los gastos de las llantas: 10
Dime los gastos del mantenimiento: 100
El costo mensual es de $4022.00
El costo anual es de $48264.00
* */