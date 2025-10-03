package p04_funciones

// TarjetaCredito

/*
* Califica si el usuario gana $2000.00 o más
* y si su calificación crediticia es de 7 puntos o más
* */

fun siCalifica() {
    println("Felicidades 🥳, si calificas para la tarjeta de crédito")
}

fun noCalifica() {
    println("Lo sentimos 😢, no calificas para la tarjeta de crédito")
}

fun main() {
    println("Banco El ahorro, tarjetas de crédito")

    print("¿Cuál es tu salario anual? ")
    val salario = readln().toDouble()

    print(
        "En una escala del 1 al 10 \n" +
                "¿Cuál sería tu calificación crediticia? " +
                "\n 10=excelente, 1=muy mala: "
    )
    val calificacionCrediticia = readln().toInt()

    // Determinar si el usuario califica
    if (salario >= 2000 && calificacionCrediticia >= 7) {
        siCalifica()
    } else {
        noCalifica()
    }
    imprimirLinea()
}
