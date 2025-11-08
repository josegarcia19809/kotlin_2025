package p05_poo

// HerenciaEscuela

/*
* Docente: nombre y materia. mostrarInfo()
* Tutor hereda de Docente
* */

// 👩‍🏫 Clase base: Docente
open class Docente {
    open val nombre = "María López"
    val materia = "Programación I"

    open fun mostrarInfo() {
        println("El (la) docente $nombre imparte la materia de $materia.")
    }
}

// 🧑‍🏫 Clase derivada: Tutor
class Tutor : Docente() {
    override val nombre = "Carlos Pérez"
    override fun mostrarInfo() {
        println(
            "El tutor $nombre apoya en la materia de $materia, bajo la guía " +
                    "del (de la) docente ${super.nombre}"
        )
    }
}

// 🧩 Ejemplo de uso
fun main() {
    val docente = Docente()
    docente.mostrarInfo()

    val tutor = Tutor()
    tutor.mostrarInfo()
}