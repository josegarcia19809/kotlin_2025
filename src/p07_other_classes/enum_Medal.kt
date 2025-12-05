package p07_other_classes

enum class Medals(val position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olympics {
    fun getMedal(position: Int): Medals {
        return when (position) {
            1 -> Medals.GOLD
            2 -> Medals.SILVER
            3 -> Medals.BRONZE
            else -> Medals.NONE
        }
    }

    fun getPosition(medal: Medals) = medal.position
}


fun main() {
    val olympics = Olympics()
    println(olympics.getMedal(2))
    println(olympics.getMedal(7))

    println(olympics.getPosition(Medals.GOLD))
    println(olympics.getPosition(Medals.BRONZE))
}
