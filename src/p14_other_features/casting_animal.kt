package p14_other_features

import kotlin.random.Random

abstract class Animal
class Dog : Animal() {
    fun bark() {
        println("Dog bark")
    }
}

class Cat : Animal() {
    fun purr() {
        println("Cat purr")
    }
}

fun getAnimals(): ArrayList<Animal> {
    val animals = ArrayList<Animal>()
    for (i in 1..10) {
        animals.add(
            if (Random.nextInt() % 2 == 0)
                Dog()
            else
                Cat()
        )
    }
    return animals
}

fun main() {
    val animals = getAnimals()
    animals.forEach { animal ->
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }
}