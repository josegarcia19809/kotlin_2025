package p11_lambdas


fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}

fun main() {
    var xprintTheName = { name: String -> println("Hello $name") }
    val nombres = arrayListOf("María", "Carolina", "José")
    sayHello(nombres, xprintTheName)

    println(".".repeat(100))
    sayHello(nombres, { name: String -> println("Hello $name") })

    println(".".repeat(100))
    sayHello(nombres) { name: String -> println("Hello $name") }

    println(".".repeat(100))
    sayHello(arrayListOf("Patricia", "Karla", "Miguel")) { name: String -> println("Hello $name") }
}