package p02_arreglos

fun main() {
    val numbers: Array<Int> = Array(6) { 0 }
    numbers[0] = 20
    numbers[3] = 30
    for (i in 0..5) {
        print("${numbers[i]} ")
    }
    println()
}
