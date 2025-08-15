package p01_fundamentos

// generoAbreviado

fun main() {
    // Pedir el género al usuario
    print("Escribe el género (M/F): ")
    val genero = readln().uppercase()

    when (genero) {
        "M" -> println("Masculino")
        "F" -> println("Femenino")
        else -> println("Otro género")
    }
}