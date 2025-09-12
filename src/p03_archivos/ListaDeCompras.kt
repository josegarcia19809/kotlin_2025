package p03_archivos

import java.io.File

// ListaDeCompras

fun main() {
    // Intentamos abrir el archivo compras.txt. Si no existe, lo creamos
    val nombreArchivo = "compras.txt"
    val archivo = File(nombreArchivo)

    // Verificar si el archivo existe
    if (!archivo.exists()) {
        archivo.createNewFile()
        println("Archivo $archivo creado")
    }

    val listaCompras: ArrayList<String> = archivo.readLines()
            as ArrayList<String>

    while (true) {
        println("🛒 Lista de compras")
        print("Escribe agregar, mostrar o salir: ")
        val accionUsuario = readln().trim().lowercase()

        when (accionUsuario) {
            "agregar" -> {
                print("🥮🍉 Dame elemento a agregar a la lista de compras: ")
                val elemento = readln()
                listaCompras.add(elemento)
                println("El elemento $elemento se agregó a la lista 🛒")
            }

            "mostrar" -> {
                println("Elementos de mi lista de compras 🛒")
                for ((indice, elemento) in listaCompras.withIndex()) {
                    println("${indice + 1}. $elemento")
                }
            }

            "salir" -> {
                archivo.writeText(listaCompras.joinToString("\n"))
                break;
            }

            else -> {
                println("Hey, ingresa una opción válida")
            }
        }
    }

}