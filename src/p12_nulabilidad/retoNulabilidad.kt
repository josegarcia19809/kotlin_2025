package p12_nulabilidad

fun retoNulabilidad() {
    // 1. Declara una variable Float no nula de dos formas
    // y asígnale el valor -3847.384
    // Ejemplo de nombres: temperatura, saldo, altura



    // 2. Ahora cambia ambas declaraciones de variables a variables que permitan nulos.



    // 3. Declara un arreglo de tipo Short no nulo. Hazlo de tamaño 5
    // y asígnale los valores 1, 2, 3, 4 y 5.
    // Nombre sugerido: numerosCortos



    // 4. Declara un arreglo de Ints que permitan nulos e inicialízalo con los valores
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., hasta llegar a 200.
    // Nombre sugerido: multiplosDeCinco



    // 5. Debes llamar a un método de Java con la siguiente firma desde Kotlin:
    // public void method1(char[] charArray). Declara un arreglo que puedas
    // pasarle al método e inicialízalo con los valores 'a', 'b' y 'c'.
    // Nombre sugerido: arregloCaracteres



    // 6. Dado el siguiente código:
    val textoMayusculas: String? = "I AM IN UPPERCASE"
    // Usando una sola línea de código, declara otra variable llamada textoProcesado
    // y asígnale textoMayusculas.toLowerCase() cuando no sea null,
    // y la cadena "¡Me rindo!" cuando sea null.



    // 7. Ahora usa la función let para:
    // (a) convertir el texto a minúsculas y luego
    // (b) reemplazar "am" con "am not" en el resultado
    // Usa un nombre de variable como textoTransformado



    // 8. Estás realmente, realmente seguro de que la variable miTextoSeguro no puede
    // contener null.
    // Cambia el siguiente código para asegurar que miTextoSeguro no sea null
    // (¡y dispárate en el pie!)
    // val miTextoSeguro: String? = "Este texto no es nulo"
}

fun main() {
    retoNulabilidad()
}