package p06_funciones_standard

fun main() {
    println("Input a number: ")
    val input = readLine()
    input?.takeIf { it.isNotBlank() }?.let {
        val number = it.toInt()
        println("The double of your number is: ${number * 2}")
    } ?: println("You must enter a number! ❗")
}