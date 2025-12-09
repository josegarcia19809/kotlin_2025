package p14_other_features

fun main() {
    val value = "Testing my strings"
    if (value is String) {
        println("This string has ${value.length} characters")
    }
}