package p10_repaso


// 01) Suma de cuadrados de pares (≤ 20)
fun demo01_sumaCuadradosPares() {
    printTitle("01. Suma de cuadrados (pares ≤ 20)")
    var suma = 0
    for (x in 1..20) {
        if (x % 2 == 0) suma += x * x
    }
    println("Suma = $suma")
}

// 02) Conteo descendente con downTo y step
fun demo02_downToStep() {
    printTitle("02. downTo con step")
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}

// 03) Rango hasta (until) con step
fun demo03_untilStep() {
    printTitle("03. until con step")
    for (i in 5 until 50 step 5) {
        println(i)
    }
}

// 04) Recorrer array por índices (indices)
fun demo04_arrayIndices() {
    printTitle("04. Array usando indices")
    val array = arrayOf("Eat", "Code", "Sleep")
    for (index in array.indices) {
        println(array[index])
    }
}

// 05) Recorrer array con withIndex (par índice/valor)
fun demo05_arrayWithIndex() {
    printTitle("05. Array con withIndex()")
    val array = arrayOf("Eat", "Code", "Sleep")
    for ((index, value) in array.withIndex()) {
        println("The value at index $index is $value")
    }
}

/*
Sugerencia de orden:
1) demo01_sumaCuadradosPares
2) demo02_downToStep
3) demo03_untilStep
4) demo04_arrayIndices
5) demo05_arrayWithIndex

// Si quieres un punto de entrada temporal:
// fun main() { demo01_sumaCuadradosPares() /* llama las demás aquí */ }
*/

fun main() {
    demo05_arrayWithIndex()
}