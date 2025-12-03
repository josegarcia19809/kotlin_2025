package p06_funciones_standard

fun main() {
    val clients = listOf("Alice", "Bob", "Carl", "Carla", "Abraham")
    println(clients)

    val nombresNoA = ArrayList<String>()

    for (client in clients) {
        client.takeUnless { it[0] == 'A' }
            ?.let { nombresNoA.add(it) }
    }
    println(nombresNoA)
}