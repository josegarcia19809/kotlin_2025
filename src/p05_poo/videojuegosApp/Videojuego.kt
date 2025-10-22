package p05_poo.videojuegosApp

class Videojuego(val titulo: String, val genero: String, val plataforma: String, val anio: Int) {
    fun mostrarDatos(): String {
        return "Videojuego: $titulo, género: $genero, plataforma: $plataforma, año: $anio"
    }
}