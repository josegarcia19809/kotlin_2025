package p02_arreglos

// ArregloHorasDemo1

fun main() {
    // Este programa muestra las horas trabajadas de 3 empleados
    val empleados = 3
    val horas: Array<Int> = Array(empleados) { 0 }

    println("Ingresa las horas trabajadas por los $empleados empleados.")

    // Lee de forma individual
    print("Empleado 1: ")
    horas[0] = readln().toInt()

    print("Empleado 2: ")
    horas[1] = readln().toInt()

    print("Empleado 3: ")
    horas[2] = readln().toInt()

    println("Las horas ingresadas son: ")
    println(horas[0])
    println(horas[1])
    println(horas[2])
}