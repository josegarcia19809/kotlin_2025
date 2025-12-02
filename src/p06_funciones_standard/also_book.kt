package p06_funciones_standard

class Book {
    fun printBook() {
        println("Printing a book")
    }
}

fun main() {
    Book().apply { printBook() }
        .also {
            println("LOG: Printing a book")
            println("LOG: Sending a email about book")
        }
}