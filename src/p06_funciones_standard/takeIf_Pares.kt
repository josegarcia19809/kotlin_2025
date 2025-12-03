package p06_funciones_standard

import kotlin.random.Random

fun main() {
    for (i in 1..10) {
        val number = Random.nextInt(100)
        val evenOrNull = number.takeIf { it % 2 == 0 }

        println("The number is $number, even: $evenOrNull")
    }
}