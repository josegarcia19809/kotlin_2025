package p05_poo

class Translator {
    fun sayHello() {
        println("English: Hello")
    }

    fun sayHello(language: String) {
        when (language) {
            "fr" -> println("French: Bonjour 😍")
            "ch" -> println("Chinese: Ni hao! 🥰")
            else -> println("English: Hello")
        }
    }
}

fun main() {
    val translator = Translator()
    translator.sayHello()
    translator.sayHello("ch")
    translator.sayHello("fr")
    translator.sayHello("mx")
}