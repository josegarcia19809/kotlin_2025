package p10_repaso

/* KOTLIN FROM SCRATCH - Adaptado al español */
/* Chapter 01: ejemplos completos en funciones demoXX_*() */

import kotlin.math.sqrt
import kotlin.math.pow
import java.io.File
import java.util.Scanner

// Utilidad para encabezados
fun imprimirTitulo(titulo: String) = println("\n=== $titulo ===")

// -------------------- Listing 01 --------------------
fun demo01_imprimirNombreEdad() {
    imprimirTitulo("01. Imprimir nombre y edad")
    val nombre = "John Sinclair"
    val edad = 30
    println("$nombre tiene $edad años")
}

// -------------------- Listing 02 --------------------
fun demo02_variablesMutablesNombreEdad() {
    imprimirTitulo("02. Variables mutables: nombre y edad")
    var nombre = "John Sinclair"
    var edad = 30
    println("$nombre tiene $edad años")
    nombre = "John Sinclair Jr."
    edad = 12
    println("$nombre tiene $edad años")
}

// -------------------- Listing 03 --------------------
fun demo03_precedenciaOperadores() {
    imprimirTitulo("03. Precedencia de operadores")
    val resultadoSinParentesis = 5 + 3 * 2
    println("Resultado sin paréntesis: $resultadoSinParentesis")

    val resultadoConParentesis = (5 + 3) * 2
    println("Resultado con paréntesis: $resultadoConParentesis")
}

// -------------------- Listing 04 --------------------
fun demo04_cadenasConEscape() {
    imprimirTitulo("04. Cadenas con caracteres de escape")
    val nombre = "John"
    val edad = 30
    val mensaje = "Nombre: $nombre\nEdad: $edad"
    println(mensaje)
}

// -------------------- Listing 05 --------------------
fun demo05_maximoConIfElse() {
    imprimirTitulo("05. Máximo con if/else")
    val a = 100
    val b = -30
    val maximo: Int

    if (a > b) {
        maximo = a
        println("a es mayor que b.")
        println("El máximo de $a y $b es: $maximo")
    } else if (a < b) {
        maximo = b
        println("b es mayor que a.")
        println("El máximo de $a y $b es: $maximo")
    } else {
        println("a y b tienen el mismo valor: $a")
    }
}

// -------------------- Listing 06 --------------------
fun demo06_whenSignoEntero() {
    imprimirTitulo("06. when: signo de un entero")
    val x = 5
    when {
        x > 0 -> println("x es positivo")
        x == 0 -> println("x es cero")
        x < 0 -> println("x es negativo")
        else -> println("x no es un número real")
    }
}

// -------------------- Listing 07 --------------------
fun demo07_saludoPorHora() {
    imprimirTitulo("07. Saludo por hora")
    val hora = 13
    when (hora) {
        in 0..11  -> println("Buenos días")
        in 12..16 -> println("Buenas tardes")
        in 17..23 -> println("Buenas noches")
        else      -> println("Hora inválida")
    }
}

// -------------------- Listing 08 --------------------
fun demo08_cuadradoAsteriscos() {
    imprimirTitulo("08. Cuadrado de asteriscos")
    val tamano = 4 // Cambia esto para ajustar el tamaño del cuadrado.
    for (i in 1..tamano) {
        for (j in 1..tamano) {
            print("* ")
        }
        println()
    }
}

// -------------------- Listing 09 --------------------
fun demo09_raizYPotencia() {
    imprimirTitulo("09. Raíz cuadrada y potencia")
    val x = 100.0
    val y = 10.0
    val textoRaiz = "La raíz cuadrada de $x es: ${sqrt(x)}"
    val textoPotencia2 = "$y elevado a la potencia 2 es: ${y.pow(2.0)}"
    println(textoRaiz)
    println(textoPotencia2)
}

// -------------------- Listing 10 --------------------
fun sumarEnteros(x: Int, y: Int): Int = x + y

fun demo10_sumarEnteros() {
    imprimirTitulo("10. Función sumar enteros")
    val a = 3
    val b = 6
    val suma = sumarEnteros(a, b)
    println("La suma de $a y $b es $suma.")
}

// -------------------- Listing 11 --------------------
fun sumarReales(x: Double, y: Double): Double = x + y
fun multiplicarReales(x: Double, y: Double): Double = x * y

fun demo11_funcionSeleccionadaPorReferencia() {
    imprimirTitulo("11. Selección de función por referencia (::)")
    val usarSuma = true // cambia a false para usar multiplicación
    val funcionSeleccionada = if (usarSuma) ::sumarReales else ::multiplicarReales

    val x = 3.0
    val y = 4.0
    val resultado = funcionSeleccionada(x, y)
    println("Resultado: $resultado")
}

// -------------------- Listing 12 --------------------
fun imprimirMensaje(mensaje: String) {
    println(mensaje)
}

fun aplicarFuncion(funcion: (String) -> Unit, entrada: String) {
    funcion(entrada)
}

fun demo12_funcionComoParametro() {
    imprimirTitulo("12. Función como parámetro")
    aplicarFuncion(::imprimirMensaje, "¡Hola, Kotlin!")
}

// -------------------- Listing 13 --------------------
fun demo13_validarEnteroEntrada() {
    imprimirTitulo("13. Validar entero desde la entrada")
    while (true) {
        print("Introduce un número entero: ")
        val entrada = readln()
        try {
            val valorEntero = entrada.toInt()
            println("Ingresaste: $valorEntero")
            break
        } catch (e: NumberFormatException) {
            println("Entrada inválida. Intenta de nuevo.")
        }
    }
}

// -------------------- Listing 14 --------------------
fun demo14_leerArchivoConScanner() {
    imprimirTitulo("14. Leer archivo con Scanner")
    val rutaArchivoEntrada = "archivo_entrada.txt" // ajusta la ruta según tu entorno
    try {
        val archivo = File(rutaArchivoEntrada)
        val lector = Scanner(archivo)
        while (lector.hasNextLine()) {
            val linea = lector.nextLine()
            println(linea)
        }
    } catch (e: Exception) {
        println("Ocurrió un error: ${e.message}")
    }
}

// -------------------- Listing 15 --------------------
fun demo15_copiarArchivo() {
    imprimirTitulo("15. Copiar archivo (leer/escribir)")
    val archivoEntrada = File("archivo_entrada.txt")  // ajusta rutas
    val archivoSalida = File("archivo_salida.txt")

    val lineas = archivoEntrada.readLines()
    for (linea in lineas) {
        archivoSalida.appendText("$linea\n")
    }
    println("Se copió archivo_entrada.txt a archivo_salida.txt")
}

/*
Sugerencia de uso:
- Llama la demo que quieras, por ejemplo:
  demo01_imprimirNombreEdad()
  demo11_funcionSeleccionadaPorReferencia()
- No hay función main para evitar choques; ejecuta las demos individualmente.
*/
