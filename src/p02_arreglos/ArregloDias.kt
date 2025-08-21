package p02_arreglos

/*
* Este programa crea un arreglo con valores iniciales (inicializado)
* */
fun main() {
    val dias = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    for (dia in dias) {
        print("$dia ")
    }
    println()
    println("-".repeat(100))

    for (i in 0 until dias.size) {
        println("Mes ${i + 1} tiene ${dias[i]} días")
    }
}