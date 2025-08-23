package p11_lambdas


/*
* Tienes una lista de clientes de tu tienda en línea.
Muestra una lista que esté ordenada por la última letra de su nombre. ✅
* */
fun main() {
    val clientes = listOf(
        "Anaz",
        "Luis",
        "Sofía",
        "Diego",
        "Valeria",
        "Martín",
        "Camila",
        "Javier",
        "Elena",
        "Rodrigo",
        "Paula",
        "Andrés",
        "Gabriela",
        "Fernando",
        "Marisol",
        "Ignacio",
        "Daniela",
        "Roberto",
        "Teresa",
        "Manuel"
    )

    val clientesOrdenados = clientes.sortedBy { it[it.length-1] }
    println(clientesOrdenados)
}