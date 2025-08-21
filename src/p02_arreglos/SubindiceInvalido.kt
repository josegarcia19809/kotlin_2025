package p02_arreglos

// SubindiceInvalido

// Este programa tendrá un error de índice fuera de rango
fun main() {
    val valores = IntArray(3)
    println("Intento de ingresar 4 elementos en un arreglo de tamaño 3")
    for (i in 0..3) {
        println("Procesando el elemento $i")
        try {
            valores[i] = 10
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("Error en el índice $i")
        }
    }
}