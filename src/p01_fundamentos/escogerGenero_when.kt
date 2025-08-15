package p01_fundamentos

fun main() {
    // Pedir el género al usuario
    print("Escribe el género (M/F o Masculino/Femenino): ")
    val genero = readln().uppercase()

    when (genero) {
        "M", "MASCULINO" -> println("Masculino")
        "F", "FEMENINO" -> println("Femenino")
        else -> println("Otro género")
    }
}