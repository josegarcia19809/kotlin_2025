package p10_repaso

fun main(args: Array<String>) {

    // Declarar dos variables inmutables de tipo String llamadas saludo1 y saludo2. Asignar "Hola"
    // a ambas variables.
    val saludo1 = "Hola"
    val saludo2 = "Hola"

    // Usando una sola línea de código, probar si saludo1 y saludo2 son referencialmente iguales
    // e imprimir el resultado.
    println("saludo1 es referencialmente igual a saludo2: ${saludo1 === saludo2}")

    // Usando una sola línea de código, probar si saludo1 y saludo2 son estructuralmente iguales
    // e imprimir el resultado.
    println("saludo1 es estructuralmente igual a saludo2: ${saludo1 == saludo2}")

    // Declarar una variable mutable de tipo Int y asignarle el valor 2988.
    var numero = 2988

    // Declarar una variable inmutable de tipo Any y asignarle la cadena
    // "El tipo Any es la raíz de la jerarquía de clases de Kotlin".
    // Luego, usando un smart cast, imprimir la cadena en mayúsculas.
    val texto: Any = "El tipo Any es la raíz de la jerarquía de clases de Kotlin"
    if (texto is String) {
        println(texto.uppercase())
    }

    // Usando una sola línea de código, imprimir lo siguiente. Asegúrate de que esté
    // bien indentado:
    //    1
    //   11
    //  111
    // 1111
    println("""   1
             |  11
             | 111
             |1111""".trimMargin())
}
