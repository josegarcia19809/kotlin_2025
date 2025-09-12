package p03_archivos

import java.io.File

// LeerArchivoMaterias

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