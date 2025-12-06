package p08_extensiones

fun Double.Companion.printClassName() {
    println("This is a Double class")
}

fun main() {
    Double.printClassName()
}