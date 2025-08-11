package p01_fundamentos

fun main() {
    // Sumar 2 números
    print("Dame primer número: ")
    val num1: Int = readln().toInt()

    print("Dame segundo número: ")
    val num2: Int = readln().toInt()

    val suma: Int = num1 + num2
    println("La suma es $suma")
}