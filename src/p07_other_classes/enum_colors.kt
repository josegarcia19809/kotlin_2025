package p07_other_classes

enum class Colors {
    RED, BLUE, GREEN, YELLOW, BLACK
}

fun main() {
    val color = Colors.RED
    when (color) {
        Colors.RED -> println("You chose red")
        Colors.BLUE -> println("You chose blue")
        Colors.GREEN -> println("You chose green")
        Colors.BLACK -> println("You chose black")

        else -> println("Unknown")
    }
}