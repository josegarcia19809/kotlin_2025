package p06_funciones_standard

fun main() {
    val numbers = arrayListOf<Int>()
    println("Please introduce 10 numbers")
    for (i in 1..10) {
        val input = readLine()!!.toInt()

        input.takeIf { it % 2 == 0 }
            .takeUnless { it == 3 || it == 13 }
            ?.let { numbers.add(it) }
    }
    println(numbers)
}