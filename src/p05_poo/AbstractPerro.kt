package p05_poo

import p04_funciones.imprimirLinea

abstract class Perro(nombre: String) {
    abstract fun correr()
    abstract fun jugar()
    abstract fun ladrar()
}

class Pug(val nombre: String) : Perro(nombre) {
    override fun correr() {
        println("$nombre puede correr")
    }

    override fun jugar() {
        println("$nombre puede jugar")
    }

    override fun ladrar() {
        println("$nombre NO puede ladrar")
    }
}

class BassetHound(val nombre: String) : Perro(nombre) {
    override fun correr() {
        println("$nombre NO puede correr")
    }

    override fun jugar() {
        println("$nombre puede jugar")
    }

    override fun ladrar() {
        println("$nombre puede ladrar")
    }
}

class Chihuahua(val nombre: String) : Perro(nombre) {
    override fun correr() {
        println("$nombre puede correr")
    }

    override fun jugar() {
        println("$nombre NO puede jugar")
    }

    override fun ladrar() {
        println("$nombre puede ladrar")
    }
}

fun main() {
    val pug = Pug(nombre = "Toby")
    pug.correr()
    pug.jugar()
    pug.ladrar()
    imprimirLinea()

    val bassetHound = BassetHound("Droopy")
    bassetHound.correr()
    bassetHound.jugar()
    bassetHound.ladrar()
    imprimirLinea()

    val chihuahua = Chihuahua(nombre = "Pepe")
    chihuahua.correr()
    chihuahua.jugar()
    chihuahua.ladrar()
}