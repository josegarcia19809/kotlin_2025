package p05_poo

interface Oven {
    val temperature: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}

class Bosh : Oven {
    override val temperature = 100

    override fun turnOn() {
        println("Turned ON")
    }

    override fun turnOff() {
        println("Turned OFF")
    }
}

fun main() {
    val myOven: Oven = getOven()
    myOven.turnOn()
    myOven.cook(50)
    myOven.turnOff()
}

fun getOven(): Oven = Bosh()