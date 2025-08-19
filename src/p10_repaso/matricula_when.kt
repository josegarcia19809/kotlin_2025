package p10_repaso

fun main() {

    // ------------------ Entrada de datos ------------------
    print("Ingresa tu número de matrícula: ")
    var matricula = readln().toInt()

    // ------------------ Ejemplo 1: when con valores exactos ------------------
    when (matricula) {
        1234 -> println("Tu salón es 101")
        2345 -> println("Tu salón es 201")
        3456 -> {
            println("Tu salón es 301")
            matricula = 1   // ejemplo de reasignación
        }
        4567 -> println("Tu salón es 401")
        else -> println("Ve a Vicerrectoría a preguntar tu salón")
    }

    // ------------------ Ejemplo 2: when con rangos ------------------
    val miSalon = when {
        matricula in 0..9999 -> "Tu salón es 1"
        matricula in 10000..19999 -> "Tu salón es 101"
        matricula in 20000..29999 -> "Tu salón es 201"
        matricula in 30000..39999 -> "Tu salón es 301"
        matricula in 40000..49999 -> "Tu salón es 401"
        else -> "Ve a Vicerrectoría a preguntar tu salón"
    }

    println(miSalon)
}
