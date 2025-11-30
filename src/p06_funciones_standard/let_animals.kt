package p06_funciones_standard

import p04_funciones.imprimirLinea

fun main() {
    val animals = arrayListOf<String?>()
    for (i in 1..3) {
        print("Input a animal: ")
        val input = readLine()
        input?.let {
            if (it == "") {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }
    imprimirLinea()
    animals.forEach {
        println("Feeding the $it")
    }
    imprimirLinea()
    animals.forEach {
        it?.let {
            println("Feeding the $it")
        }
    }
}