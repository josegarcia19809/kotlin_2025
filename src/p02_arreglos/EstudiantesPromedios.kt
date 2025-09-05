package p02_arreglos

fun main() {
    val estudiantes = 2
    val materias = 3

    val calificaciones = Array(estudiantes) {
        IntArray(materias)
    }

    println("Calificaciones de estudiantes en diferentes materias")

    // Captura de calificaciones
    for (i in 0 until estudiantes) {
        for (j in 0 until materias) {
            print("Dame calificación ${j + 1} del estudiante ${i + 1}: ")
            calificaciones[i][j] = readln().toInt()
        }
        println()
    }

    println("Lista de calificaciones: ")
    // Imprimir la tabla
    println("Estudiante \t\tMatemáticas\tCiencias\tHistoria\tPromedio")
    for (i in 0 until estudiantes) {
        var totalCalificaciones = 0.0
        print("Estudiante ${i + 1}\t\t\t  ")
        for (j in 0 until materias) {
            print("${calificaciones[i][j]}\t\t")
            totalCalificaciones += calificaciones[i][j]
        }
        val promedio: Double = totalCalificaciones / materias
        print("%.1f".format(promedio))
        println()
    }
}