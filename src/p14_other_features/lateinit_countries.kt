package p14_other_features

class Country {
    private lateinit var name: String

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name
}

fun main() {
    val myCountry = Country().apply { setName("Berlin") }
    println("Hello ${myCountry.getName()}!")
}