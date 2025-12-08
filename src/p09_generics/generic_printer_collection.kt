package p09_generics

import p04_funciones.imprimirLinea

class Printer<T : Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach(::println)
    }
}

fun main() {
    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Alice", "Bob", "Carol"))
    imprimirLinea()
    val printer2 = Printer<List<String>>()
    printer2.iterate(listOf("Dan", "Eric", "Maria"))
}