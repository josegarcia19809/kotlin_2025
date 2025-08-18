package p01_fundamentos

// Este programa muestra las calorías quemadas en intervalos de 5 minutos
fun main() {
    println("Minutos\t\tCalorías quemadas")
    for (minutos in 10..30 step 5) {
        val caloriasQuemadas = 4.2 * minutos
        println("$minutos\t\t\t$caloriasQuemadas")
    }
}
