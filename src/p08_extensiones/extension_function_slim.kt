package p08_extensiones

fun String.slim() = this.substring(0, this.length - 1)

val String.betterLenght: Int
    get() = 200

fun main() {
    val name = "Michael"
    println(name.slim())
    println(name.betterLenght)
}