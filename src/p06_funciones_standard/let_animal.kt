package p06_funciones_standard

import p04_funciones.imprimirLinea


fun main() {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")

    animals.map { it.length }
        .filter { it > 3 }
        .let {
            println(it)
            println("Size of list is ${it.size}")
        }

    imprimirLinea()

    animals.map { it.length }
        .filter { it <= 4 }
        .let { filteredList ->
            println(filteredList)
            println("Size of list is ${filteredList.size}")
        }

    imprimirLinea()
    animals.map { it.length }
        .filter { it > 3 }
        .let(::println)
}