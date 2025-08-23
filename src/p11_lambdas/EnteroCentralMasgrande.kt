package p11_lambdas


/*
* Dada una lista de números enteros de 3 dígitos.
Imprime el número entero que tenga el dígito central más grande. ✅
* */
fun main() {
    val numeros = listOf(
        123, 456, 789, 234, 567,
        891, 345, 672, 918, 247,
        853, 492, 736, 159, 804,
        621, 475, 932, 268, 357
    )

    val max = numeros.maxBy { it % 100 - it % 10 }
    println("Max: $max")
    println()
    println(numeros.maxBy { it.toString()[1].code })
    println()

    val max2 = numeros.maxBy { it / 10 % 10 }
    println("Max2: $max2")
}