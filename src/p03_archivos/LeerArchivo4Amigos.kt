package p03_archivos

import java.io.File

// LeerArchivo4Amigos

fun main() {
    val archivo = File("amigos4.txt")

    // Leer el archivo línea por línea
    val lineas = archivo.readLines()

    // Imprimir cada línea
    for (linea in lineas) {
        println(linea)
    }
}