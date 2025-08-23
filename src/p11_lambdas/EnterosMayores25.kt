package p11_lambdas

/*
**Dada una colección de números enteros aleatorios.

Si un número es impar, duplícalo.

Si un número es par, divídelo a la mitad.

Imprime un subconjunto de la colección que tenga números mayores que 25.** ✅
 */

fun main() {
    val numeros = listOf(
        12, 45, 78, 23, 56,
        81, 35, 62, 91, 24,
        83, 42, 76, 5, 8,
        61, 75, 32, 18, 3
    )

    numeros.map { if (it % 2 == 1) it * 2 else it / 2 }
        .filter { it > 25 }
        .forEach { print("$it\t") }
}