package p04_funciones

fun estaAprobado() {
    println("Felicidades 🥳, ya aprobaste")
}

fun noEstaAprobado() {
    println("Ni modo 😭, no aprobaste")
}

fun main() {
    println("Bienvenido al sistema de calificaciones")

    print("Dame tu calificación (0.0 a 10.0): ")
    val calificacion = readln().toDouble()

    print("Dame tu porcentaje de asistencias: ")
    val porcentaje = readln().toInt()

    if (calificacion >= 6.0 && porcentaje >= 80) {
        estaAprobado()
    } else {
        noEstaAprobado()
    }

    imprimirLinea()
}