package p06_funciones_standard

class Restaurant {
    var stardardDish = ""
    var todaySpecial = ""

    fun printMenu() {
        println("The standard dish is ${this.stardardDish}")
        println("The today special is ${this.todaySpecial}")
    }
}

fun main() {
    val dishToday = Restaurant().run {
        stardardDish = "Fish and chips"
        todaySpecial = "Fillet mignon"
        printMenu()
        this.todaySpecial
    }
    println(dishToday)
}