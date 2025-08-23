package p11_lambdas


/*Dado un conjunto de números enteros aleatorios, imprime un subconjunto que consista únicamente
en números enteros de dos dígitos. ✅
 */
fun main() {
    val numeros = listOf<Int>(12, 34, 56, 6, 4, 2, 100)
    val numerosCadenas = numeros.map { it.toString() }
        .filter { it.length == 2 }
        .forEach { println(it) }

    println()
    println(numeros.filter { it in 10..99 })
}