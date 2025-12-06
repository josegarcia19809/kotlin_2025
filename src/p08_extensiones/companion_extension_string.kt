package p08_extensiones

fun String.Companion.getClassType() {
    println("This is a String class")
}

fun main() {
    String.getClassType()
}