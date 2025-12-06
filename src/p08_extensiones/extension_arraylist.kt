package p08_extensiones

fun ArrayList<Int>.howMany() = "This list contains $size elements"

fun main() {
    val list = arrayListOf(1, 5, 2, 3, 5, 1)
    println(list.howMany())
}