package p09_generics

class NewBox<T, U> {
    fun display(item: T, item2: U) {
        println(item)
        println(item2)
    }
}

fun main() {
    val newBox = NewBox<Int, Float>()
    newBox.display(34, 57.7F)
}