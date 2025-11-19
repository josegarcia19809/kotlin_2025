package p05_poo

abstract class Instrumento {
    abstract fun tocar()
}

class Guitarra : Instrumento() {
    fun afinar() {
        println("Afinando la guitarra 🎸")
    }

    override fun tocar() {
        println("Tocando la guitarra con acordes alegres 🎶")
    }
}

class Piano : Instrumento() {
    override fun tocar() {
        println("Tocando el piano con melodía suave 🎹")
    }
}

fun main() {
    val guitarra: Instrumento = Guitarra()
    guitarra.tocar()
    if (guitarra is Guitarra) {
        guitarra.afinar()
    }

    // Crear un objeto myPiano
    val myPiano: Instrumento = Piano()
    // Mandar llamar a su método tocar()
    myPiano.tocar()
}