package p06_funciones_standard

fun main() {
    var numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers)

    val newNumbers = arrayListOf<Int>()
    for (number in numbers) {
        number.takeIf { it % 2 == 0 }
            ?.let(newNumbers::add)
    }
    println(newNumbers)
}