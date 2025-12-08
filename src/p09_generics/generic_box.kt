package p09_generics

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class Car {
    override fun toString(): String {
        return "This is a car"
    }
}

fun main() {
    val box = Box<String>()
    box.display("Hello")

    val carBox = Box<Car>()
    carBox.display(Car())
}