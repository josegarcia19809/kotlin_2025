package p14_other_features

class NewUser {
    fun printWelcome() {
        println("Welcome to the course!")
    }
}

fun main() {
    val newUser by lazy { NewUser() }
    val banned = listOf("Alice", "Bob", "Charlie", "")
    print("Please enter a username: ")
    val userName = readln()
    if (!banned.contains(userName)) {
        newUser.printWelcome()
    }
}