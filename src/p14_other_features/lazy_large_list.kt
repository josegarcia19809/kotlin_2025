package p14_other_features

fun generateList(): List<Int> {
    val integerList = arrayListOf<Int>()
    for (number in 1..10000) {
        integerList.add(number)
    }
    return integerList
}

fun main() {
    val listNumbers by lazy { generateList() }
    print("Should the list be generated? (yes/no): ")
    val input = readln()
    if (input == "yes") {
        println(listNumbers)
    }
}