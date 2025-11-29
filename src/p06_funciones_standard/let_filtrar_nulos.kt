package p06_funciones_standard

fun main() {
    print("Escribe tu nombre: ")
    val name = readLine()
    name?.let { println("Tu nombre es $it") }
}