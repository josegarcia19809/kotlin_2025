package p05_poo

abstract class Instrumento{
    abstract fun tocar()
}

class Guitarra : Instrumento(){

    fun afinar(){
        println("Afinando la guitarra 🎸")
    }
    override fun tocar(){
        println("Tocando la guitarra con acordes alegres 🎶")
    }
}

class Piano : Instrumento(){
    override fun tocar(){
        println("Tocando el piano con una melodía suave 🎹")
    }
}

fun main() {
    val guitarra: Instrumento = Guitarra()
    guitarra.tocar()
}