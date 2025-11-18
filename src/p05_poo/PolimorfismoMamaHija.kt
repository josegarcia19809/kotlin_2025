package p05_poo

open class Mom {
    open fun say(message: String) {
        println("Mom says $message")
    }
}

class Daughter : Mom() {
    override fun say(message: String) {
        println("Daughter says $message")
    }
}

fun main() {
    val mom = Mom()
    val daughter: Mom = Daughter()

    mom.say("👩🏼Mami llego!!!")
    daughter.say("👧🏻Hey, no, daughter...")
}