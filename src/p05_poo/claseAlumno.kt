package p05_poo

class Alumno(val nombre: String, val carrera: String) {
    fun obtenerDatos(): String {
        return "Nombre: $nombre, carrera: $carrera"
    }
}

fun main() {
    val alumno1 = Alumno("José García", "Ing. en Computación")
    println(alumno1.obtenerDatos())

    val alumno2 = Alumno("María Sánchez", "Licenciatura en Informática")
    println(alumno2.obtenerDatos())
}