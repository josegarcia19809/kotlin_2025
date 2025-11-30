package p06_funciones_standard

class Store {
    var shoes = 0
    var shirts = 0
    var jackets = 0

    fun printInventory() {
        println("The store has:")
        println("Shoes $shoes")
        println("Shirts $shirts")
        println("Jackets $jackets")
    }
}

fun main() {
    val store = Store()
    with(store) {
        shoes = 25
        shirts = 30
        jackets = 30
        printInventory()
    }
}