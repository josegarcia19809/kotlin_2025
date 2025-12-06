package p08_extensiones

class Book {
    companion object {}
}

fun Book.Companion.printMe() {
    println("Book has been printed")
}

fun main() {
    Book.printMe()
}