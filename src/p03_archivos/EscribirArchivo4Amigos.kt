package p03_archivos

import java.io.File

// EscribirArchivo4Amigos

fun main() {
    val archivo = File("amigos4.txt")
    val salidaArchivo = listOf("Rox", "Isaac", "Carolina", "Ami")

    archivo.writeText(salidaArchivo.joinToString ("\n"))

    println("El archivo amigos4.txt se ha escrito correctamente")
}