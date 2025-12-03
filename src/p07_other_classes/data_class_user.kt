package p07_other_classes

data class User(
    val name: String,
    val email: String,
    val password: String
)

fun main() {
    val user1 = User("Jose", "jose@com.com", "abc")
    println(user1)

    val user2 = User("Jose", "jose@com.com", "abc")
    println(user2)

    println("user1 == user2: ${user1 == user2}")

    val user3 = user2.copy(email = "luis@com")
    println(user3)
}