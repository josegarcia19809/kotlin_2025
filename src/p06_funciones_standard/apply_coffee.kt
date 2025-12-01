package p06_funciones_standard

class CoffeeCup {
    var clientName = ""
    fun prepareCoffee() {
        println("Brewing the coffee")
    }
}

class CoffeShop {
    fun sellCoffee(name: String) {
        CoffeeCup().apply {
            clientName = name
            prepareCoffee()
            println("Serving coffee to client $clientName")
            println("Client name: ${this.clientName}")
        }
    }
}

fun main() {
    print("What is your name? ")
    val name = readLine() ?: ""
    CoffeShop().sellCoffee(name)
}