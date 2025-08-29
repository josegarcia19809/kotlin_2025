package p12_nulabilidad

// 🎯 Objetivo: mostrar cómo manejar nulos y conversiones seguras en Kotlin
// Operadores clave:
//  - ?.  → llamada segura (si es null, la expresión retorna null)
//  - ?:  → Elvis (valor por defecto cuando es null)
//  - !!  → afirmación no nula (⚠️ lanza NullPointerException si es null)
//  - as? → conversión/cast seguro (si falla, devuelve null en lugar de lanzar excepción)

fun demostracionNulabilidad() {
    // 1) Variable que puede ser nula
    val cadenaNula: String? = null

    // 2) ⚠️ EJEMPLO NO RECOMENDADO: afirmación no nula
    //    Descomentar la línea siguiente lanzaría NullPointerException:
    //    val mayusPeligro = cadenaNula!!.uppercase()

    // 3) Llamada segura: si 'cadenaNula' es null, toda la expresión es null
    println("Mayúsculas (seguro): ${cadenaNula?.uppercase()}")  // imprime: Mayúsculas (seguro): null

    // 4) Operador Elvis: si es null, usa un valor por defecto
    val textoConDefault = cadenaNula ?: "Valor por defecto"
    println(textoConDefault)  // imprime: Valor por defecto

    // 5) Ejemplo típico de encadenar con Elvis (modelo de dominio)
    // val pais = sucursal?.direccion?.pais ?: "MX"

    // 6) Conversión segura (as?): no lanza excepción, devuelve null si no se puede convertir
    val algo: Any = arrayOf(1, 2, 3, 4)   // 'algo' NO es String
    val comoTexto: String? = algo as? String
    println(comoTexto)                    // imprime: null
    println(comoTexto?.uppercase())       // imprime: null (llamada segura)
}

// 🎯 Objetivo: demostrar el uso de variables nulas, let, comparaciones y el operador !! en Kotlin

fun demostrarUsoVariablesNulas() {
    // 1) Variable que puede ser nula (nullable)
    val cadenaOpcional: String? = "Este texto no es nulo"

    // Usamos let con llamada segura (?.)
    // Si la variable no es null, ejecuta el bloque y manda el valor a la función
    cadenaOpcional?.let { imprimirTexto(it) }   // imprime: "Este texto no es nulo"

    // 2) Comparación entre null y una cadena no nula
    val otraCadenaNula: String? = null
    val cadenaNormal: String = "Este texto no es nulo"
    println(otraCadenaNula == cadenaNormal)     // imprime: false

    // 3) Operador !! (afirmación no nula)
    // ⚠️ Lanza NullPointerException si la variable resulta ser null
    val cadenaForzada: String = cadenaOpcional!!
    val enMayusculas = cadenaForzada.uppercase()
    println(enMayusculas)   // imprime: "ESTE TEXTO NO ES NULO"
}

// Función simple que imprime un texto
fun imprimirTexto(texto: String) {
    println(texto)
}

fun main() {
    demostracionNulabilidad()
    println("-".repeat(100))
    demostrarUsoVariablesNulas()
}