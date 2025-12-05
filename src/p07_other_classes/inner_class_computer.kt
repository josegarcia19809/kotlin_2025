package p07_other_classes

class Computer {
    inner class OperatingSystem {
        fun startOS() {
            println("Starting OS")
        }
    }

    fun boot() {
        println("Booting up computer")
        val operatingSystem = OperatingSystem()
        operatingSystem.startOS()
        println("Computer ready")
    }
}

fun main() {
    val computer = Computer()
    computer.boot()
}