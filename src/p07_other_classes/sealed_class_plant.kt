package p07_other_classes

abstract class Plant

sealed class Fruit : Plant()
sealed class Vegetable : Plant()

class Apple : Fruit()
class Potato : Vegetable()

fun getPlant(tipo: Int): Plant {
    if (tipo == 0) {
        return Apple()
    } else if (tipo == 1) {
        return Potato()
    }
    return Apple()
}


fun main() {
    val someplant = getPlant(0)

    when (someplant) {
        is Fruit -> println("Sweet fruit")
        is Vegetable -> println("Tasty vegetable")
    }
}