package p07_other_classes

import kotlin.random.Random

sealed class Prize

sealed class CarPrize : Prize()
sealed class Vacation : Prize()
sealed class GiftCard : Prize()

class VWCar : CarPrize()
class FranceHoliday : Vacation()
class Card10 : GiftCard()

fun lottery(): Prize {
    val number = Random.nextInt(3)
    return when (number) {
        0 -> FranceHoliday()
        1 -> VWCar()
        else -> Card10()
    }
}

fun main() {
    for (x in 1..10) {
        val prize = lottery()
        when (prize) {
            is CarPrize -> println("Wow, I won a car!")
            is Vacation -> println("I'm going on holiday!")
            is GiftCard -> println("Yay, a gift card!")
        }
    }
}