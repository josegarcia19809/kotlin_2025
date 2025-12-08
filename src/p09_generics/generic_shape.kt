package p09_generics

abstract class Shape {
    abstract fun area(size: Int): Double
}

class Square : Shape() {
    override fun area(size: Int) = size.toDouble() * size
}

class Circle : Shape() {
    override fun area(size: Int) = size * size * 3.1416
}

class Geometry<T : Shape> {
    fun getMessage(shape: T, size: Int) {
        println("The area of this shape is ${shape.area(size)}")
    }
}

fun main() {
    val shape1 = Geometry<Square>()
    shape1.getMessage(Square(), 5)

    val shape2 = Geometry<Circle>()
    shape2.getMessage(Circle(), 5)
}