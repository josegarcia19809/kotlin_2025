package p11_lambdas

/*
Crea una función de orden superior que reciba una lista de nombres de clientes y una expresión lambda que
devuelva una cadena (String).

Luego, aplica la expresión lambda a cada nombre de cliente, crea una nueva colección con
los resultados y devuelve el resultado.

Crea una expresión lambda que reciba un nombre de cliente (String) y devuelva un mensaje personalizado.

Llama a la función de orden superior y muestra el resultado.

 */

fun recibiendoNombresClientes(
    nombres: ArrayList<String>,
    operacionSaludo: (String) -> String
): ArrayList<String> {
    val saludos = ArrayList<String>()
    for (i in nombres.indices) {
        saludos.add(operacionSaludo(nombres[i]))
    }
    return saludos
}

// Función de orden superior----Otra forma
fun procesarClientes(
    clientes: List<String>,
    operacion: (String) -> String
): List<String> {
    return clientes.map { operacion(it) }
}

fun main() {
    val nombres = arrayListOf("Patricia", "Karla", "Miguel")
    val operacionSaludo = { nombre: String -> "Buenos días $nombre" }
    val saludosPersonalizados = recibiendoNombresClientes(nombres, operacionSaludo)
    println(saludosPersonalizados)

    println("-".repeat(100))
    // Lambda que genera un mensaje personalizado
    val mensajePersonalizado: (String) -> String = { nombre ->
        "Hola $nombre, gracias por tu preferencia."
    }

    // Ejemplo de uso
    val listaClientes = listOf("Ana", "Luis", "María")
    val resultado = procesarClientes(listaClientes, mensajePersonalizado)

    // Mostrar resultado
    resultado.forEach { println(it) }
}