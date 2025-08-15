package p01_fundamentos

fun main() {
    print("Por favor, ingresa un animal: ")
    val animal = readln()

    val accion = if (animal == "perro") {
        "alimentarlo 🐶"
    } else if (animal == "gato") {
        "cuidarlo 🐈"
    } else if (animal == "cocodrilo") {
        "huir de él 🐊"
    } else {
        "buscar qué hacer en Google 🛜"
    }
    println("Si encontraste un $animal debes $accion")
}