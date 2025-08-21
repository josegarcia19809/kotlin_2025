package p02_arreglos

fun main() {
    // Pedir las horas trabajadas de 3 empleados
    val empleados = 3
    val horas: Array<Int> = Array(empleados) { 0 }

    println("Ingresa las horas trabajadas de los $empleados empleados")

    for (i in 1..empleados) {
        print("Empleado $i: ")
        horas[i - 1] = readln().toInt()
    }

    println("Los valores ingresados son: ")
    for (i in 1..empleados) {
        println(horas[i - 1])
    }

    println("-".repeat(100))
    for (hora in horas){
        println(hora)
    }

    println("-".repeat(100))
    for (i in 0 until empleados){
        println(horas[i])
    }


}