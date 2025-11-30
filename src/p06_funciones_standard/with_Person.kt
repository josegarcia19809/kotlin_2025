package p06_funciones_standard

/**
 * 👉 Imagina una clase Person que tiene nombre, apellido y edad, además de una función que imprime toda su información.
 * 👉 Tu tarea es crear un objeto de esta clase, actualizar sus datos y luego llamar a la función que muestra su información.
 * ¡Así practicas cómo crear objetos, modificarlos y usar sus funciones! 🚀😊
 *
 */

private class Person {
    var firstName = ""
    var lastName = ""
    var age = 0

    fun printInfo() {
        println("First Name: $firstName, Last Name: $lastName, Age: $age")
    }
}

fun main() {
    val person = Person()
    with(person) {
        firstName = "José"
        lastName = "García"
        age = 20
        printInfo()
    }
}