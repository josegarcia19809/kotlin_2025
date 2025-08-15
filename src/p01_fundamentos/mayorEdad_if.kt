package p01_fundamentos

// mayorEdad
/*
* Si tiene 18 años o más, mensaje "Eres mayor de edad"
* de lo contrario, mensaje "Eres menor de edad"
* */

fun main() {
    print("Dame tu edad: ")
    val edad = readln().toInt()

    val mensaje = if (edad >= 18) "Eres mayor" else "Eres menor"
    println("$mensaje de edad")
}