package p01_fundamentos

// Este programa muestra los mm elevados por año
fun main() {
    println("Año\tmm elevados")
    for (anio in 1..25) {
        println("$anio\t${1.5 * anio} 🌧 🌊")
    }
}
