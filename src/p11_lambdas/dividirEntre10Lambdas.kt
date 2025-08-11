package p11_lambdas

/*
Crea una función de orden superior que reciba una colección mutable de enteros y una función lambda.
Luego, aplica la función lambda a cada elemento par de esa colección.
Crea una función lambda que, cuando se aplique a un entero, devuelva ese entero dividido entre 10.
Llama a la función de orden superior usando tu lambda y muestra el resultado.

 */

fun dividirColeccionEnteros(numeros: ArrayList<Int>, operacion: (Int) -> Double): ArrayList<Int> {
    for (i in numeros.indices) {
        if (numeros[i] % 2 == 0) {
            numeros[i] = operacion(numeros[i]).toInt()
        }
    }
    return numeros
}

// Función de orden superior---- Otra forma
fun aplicarALosPares(
    coleccion: MutableList<Int>,
    operacion: (Int) -> Int
): MutableList<Int> {
    for (i in coleccion.indices) {
        if (coleccion[i] % 2 == 0) {
            coleccion[i] = operacion(coleccion[i])
        }
    }
    return coleccion
}

fun main() {
    val miLista = arrayListOf(10, 21, 31, 40, 51, 61, 70, 81, 91, 100)
    val dividirElementos = { numero: Int -> numero / 10.0 }
    val resultados = dividirColeccionEnteros(miLista, dividirElementos)
    println(resultados)

    // Lambda que divide un entero entre 10
    val dividirEntreDiez: (Int) -> Int = { it / 10 }

    // Ejemplo de uso
    val numeros = mutableListOf(10, 21, 31, 40, 51, 61, 70, 81, 91, 100)
    val resultado = aplicarALosPares(numeros, dividirEntreDiez)

    // Mostrar resultado
    println(resultado) // [1, 21, 31, 4, 51, 61, 7, 81, 91, 10]
}