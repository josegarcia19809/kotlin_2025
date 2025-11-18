package p05_poo

class Mom2() {
    fun say(message: String) {
        println("Mom says $message")
    }

    fun say() {
        println("Mom says hi")
    }

    fun say(message: String, times: Int) {
        println("Mom says $message $times times")
    }
}

fun main() {
    val mom = Mom2()
    mom.say("Hi 👋🏻")
    mom.say()
    mom.say("Bye", 3)
}