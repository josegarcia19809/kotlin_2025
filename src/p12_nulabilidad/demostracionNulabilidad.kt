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

/*
🔑 Explicación de lo importante

?.let { ... }
Se ejecuta solo si la variable no es null. Muy útil para evitar validaciones if (x != null).

Comparación con null (==)
En Kotlin, comparar una cadena nula con otra cadena devuelve false. No lanza error.

!! (not-null assertion)
Le decimos al compilador: “Confía en mí, no es null”. Si lo es, explota con NullPointerException.
👉 Se recomienda evitarlo en la práctica, excepto en casos muy controlados.
* */

// Función simple que imprime un texto
fun imprimirTexto(texto: String) {
    println(texto)
}

fun ejemploArregloNulo() {
    // 1) Creamos un arreglo de enteros que permite valores nulos
    val enterosNulos = arrayOfNulls<Int>(5)
    // Inicialmente: [null, null, null, null, null]

    // 2) Recorremos el arreglo y mostramos cada elemento
    println("Elementos de un arreglo nulo")
    for (numero in enterosNulos) {
        print("$numero ")   // imprime 5 veces "null"
    }
    println()

    // 3) Acceso inseguro: esto lanza NullPointerException ⚠️
    // println(enterosNulos[3].toString())

    // 4) Acceso seguro con ?. → devuelve null como cadena sin error
    println("Imprime el elemento[3] como cadena: ")
    println(enterosNulos[3]?.toString())   // imprime: null

    // 5) Si asignamos un valor, ya podemos usar toString() sin riesgo
    enterosNulos[3] = 42
    println("Después de asignar un valor a elemento[3]")
    println(enterosNulos[3].toString())   // imprime: 42
}

fun main() {
    demostracionNulabilidad()
    println("-".repeat(100))
    demostrarUsoVariablesNulas()
    println("-".repeat(100))
    ejemploArregloNulo()
}