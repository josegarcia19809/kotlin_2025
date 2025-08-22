package p02_arreglos

// ArregloPuntuacionesExamen

fun main() {
    // Solicitar cuántos exámenes se aplicaron
    print("¿Cuántos exámenes se aplicaron? ")
    val numExas = readln().toIntOrNull() ?: 0

    // Crear el arreglo con un tamaño según el número de exámenes
    val examenes = IntArray(numExas)

    // Pedir cada una de las calificaciones
    for (i in examenes.indices) {
        print("Introduce la calificación #${i + 1}: ")
        examenes[i] = readln().toIntOrNull() ?: 0
    }

    // Mostrar las calificaciones
    println()

    println("Las calificaciones son: ")
    for (califExamen in examenes) {
        print("$califExamen ")
    }
    println()
    println(examenes.joinToString(", ", "[", "]"))

}