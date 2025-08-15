package p01_fundamentos

// parImpar
/*
* si un número % 2 == 0 es par, de lo contrario es impar
* */

fun main() {
    print("Introduce un número: ")
    val numero = readln().toInt()

    val mensaje = if (numero % 2 == 0) "par" else "impar"
    println("El $numero es $mensaje")
}