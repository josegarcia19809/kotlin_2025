package p09_generics

class Info<T> {

    fun display(item: T) {
        println(item.toString())
    }

    fun getLength(item: T) {
        println(item.toString().length)
    }
}

fun main() {
    val info = Info<String>()
    info.display("Some String")
    info.getLength("Some String")

    val info2 = Info<Double>()
    info2.display(23.32)
    info2.getLength(23.32)

    val info3 = Info<ArrayList<Int>>()
    info3.display(arrayListOf(3, 6, 8))
    info3.getLength(arrayListOf(3, 6, 8))
}