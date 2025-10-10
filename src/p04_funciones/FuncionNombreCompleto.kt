package p04_funciones

// FuncionNombreCompleto

/*
* La función recibirá el nombre, el apellido paterno y
* el apellido materno de una persona, la función devolverá la cadena
* empezando por el apellido paterno, luego el apellido materno,
* luego una coma y luego el nombre
* */

fun mostrarNombreCompleto(nombre: String, apellidoP: String, apellidoM: String){
    println("$apellidoP $apellidoM, $nombre")
}

fun main() {
    mostrarNombreCompleto("José Luis", "García", "Morales")
    mostrarNombreCompleto("Mariana", "García", "Monroy")
}