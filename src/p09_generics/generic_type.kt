package p09_generics

class Type<T> {
    fun printMessage(msg: T) {
        println("The item converted to a String is ${msg.toString()}")
    }
}

fun main() {
    val type1 = Type<Float>()
    type1.printMessage(36.45F)

    val type2 = Type<HashMap<String, Int>>()
    type2.printMessage(
        hashMapOf(
            Pair("one", 1),
            Pair("two", 2),
            Pair("three", 3)
        )
    )
}