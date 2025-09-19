package p03_archivos


// LeerArchivoMaterias.kt

import java.io.File

fun main() {
    val nombreArchivo = "materias.txt"
    val archivo = File(nombreArchivo)

    // Leer el archivo línea por línea
    val materias: ArrayList<String> = archivo.readLines()
            as ArrayList<String>

    // Imprimir cada línea
    for (materia in materias) {
        println(materia)
    }
}