package p14_other_features

import kotlin.random.Random

fun main() {
    val someLargeVariable: String by lazy { "A large value" }

    val rand = Random.nextInt()

    if (rand % 2 == 0) {
        println(someLargeVariable)  // Se inicializa solo si llegamos aquí 🎉
    }
}