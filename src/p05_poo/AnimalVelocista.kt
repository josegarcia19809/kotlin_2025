package p05_poo

class Animal(var nombre: String, var velocidadMaxima: Int) {
    // Función que muestra la velocidad máxima del animal
    fun correr() {
        println("🏃🏻‍♂️ ¡$nombre puede correr hasta $velocidadMaxima km/h!")
    }
}

fun main() {
    // Crear un objeto de tipo Animal
    val guepardo = Animal("Guepardo", 100)
    guepardo.correr()

    // Actualizamos la velocidad máxima
    guepardo.velocidadMaxima = 120

    guepardo.correr()
}