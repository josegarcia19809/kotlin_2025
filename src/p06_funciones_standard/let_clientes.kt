package p06_funciones_standard

fun main() {
    val clients = arrayListOf<String?>()
    while (true) {
        print("Enter client name (or 'stop' to finish): ")
        val input = readLine()
        // parar si el usuario escribe "stop" (ignora mayúsculas) o
        // si llega EOF (input == null)
        if (input == null || input.equals("stop", ignoreCase = true)) break

        // si la cadena está vacía, guardamos null; si no, el nombre
        if (input.isEmpty()) clients.add(null) else clients.add(input)
    }
    println()
    println(clients)
    println()
    clients.forEach {
        it?.let {
            println("Hello $it")
        }
    }
}