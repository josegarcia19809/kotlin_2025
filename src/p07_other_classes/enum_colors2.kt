package p07_other_classes

enum class Colors2(val timeUsed: Int) {
    RED(34),
    BLUE(25),
    GREEN(45)
}

fun main() {
    val color = Colors2.RED
    when (color) {
        Colors2.RED -> println("You chose red")
        Colors2.BLUE -> println("You chose blue")
        Colors2.GREEN -> println("You chose green")

        else -> println("Unknown")
    }

    println(Colors2.GREEN.name)
    println(Colors2.RED.timeUsed)
    println(Colors2.BLUE.ordinal)
}