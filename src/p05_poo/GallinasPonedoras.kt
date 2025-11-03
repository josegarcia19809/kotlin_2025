package p05_poo

// GallinasPonedoras

class Gallina(val nombre: String, val especie: String) {
    private var huevos = 0

    fun ponerHuevo() {
        huevos++
    }

    fun obtenerCantidadHuevos(): Int {
        return huevos
    }

    fun obtenerDatos(): String {
        return "Nombre: $nombre, especie: $especie, ha puesto $huevos huevos"
    }
}

fun main() {
    //-------------------- gallina 1
    val gallina1 = Gallina("Lola", "Leghorn")
    println(gallina1.obtenerDatos())
    gallina1.ponerHuevo()
    println("${gallina1.nombre} ha puesto ${gallina1.obtenerCantidadHuevos()} huevo(s)")

    repeat(5) {
        gallina1.ponerHuevo()
        println("${gallina1.nombre} ha puesto ${gallina1.obtenerCantidadHuevos()} huevo(s)")
    }
    println("-".repeat(100))

    //-------------------- gallina 2
    val gallina2 = Gallina("Turuleka", "Lohman")
    repeat(4) {
        gallina2.ponerHuevo()
    }
    println(gallina2.obtenerDatos())
    println("-".repeat(100))

    //-------------------- gallina 3
    val gallina3 = Gallina("Chabela", "Isa Brown")
    repeat(3) {
        gallina3.ponerHuevo()
    }
    println(gallina3.obtenerDatos())
    println("-".repeat(100))
}