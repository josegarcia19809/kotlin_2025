package p01_fundamentos

// Programa para dividir un número entre otro
// Si el segundo es cero, se muestra un mensaje de error

fun main() {
    println("Programa de división")

    print("Dame el primer número: ")
    val num1: Double = readln().toDouble()

    print("Dame otro número: ")
    val num2: Double = readln().toDouble()

    // Comprobar si se puede dividir entre cero
    if (num2 == 0.0) {
        // Error: división entre cero
        println("No existe la división entre cero")
        println("Ejecuta el programa de nuevo e introduce un número diferente de cero")
    } else {
        // Realizar la división y mostrar el resultado
        val resultado = num1 / num2;
        println("El resultado es $resultado")
    }
}
// Ejemplo:
// 10/5 -> 2
// 10/0 -> No existe la división entre cero