package p01_fundamentos

// Calcular_Salario_Bruto

fun main() {
    var horasTrabajadas = 5
    val pagoPorHora = 100.50

    horasTrabajadas = 8
    println("Horas trabajadas: $horasTrabajadas")
    println("Pago por hora: $pagoPorHora")
    println("Salario bruto: ${horasTrabajadas * pagoPorHora}")

}