package p10_repaso


// ===============================
// 00. Utilidad de impresión
// ===============================
fun printTitle(title: String) {
    println("\n=== $title ===")
}

// ===============================
// 01. Rangos básicos con Int
// ===============================
fun demo01RangosBasicos() {
    printTitle("01. Rangos básicos (1..5)")
    val range = 1..5
    for (i in range) {
        println(i)
    }
}

// ===============================
// 02. step y until
// ===============================
fun demo02StepYUntil() {
    printTitle("02. step y until")
    println("1..20 step 4")
    for (num in 1..20 step 4) {
        println(num)
    }

    println("1 until 10 (excluye el 10)")
    for (i in 1 until 10) {
        println(i)
    }
}

// ===============================
// 03. downTo (decreciente) + step
// ===============================
fun demo03DownTo() {
    printTitle("03. downTo con step")
    for (i in 20 downTo 10 step 5) {
        println(i)
    }
}

// ===============================
// 04. Rangos de Char y de String
// ===============================
fun demo04_rangosCharYString() {
    printTitle("04. Rangos de Char y de String")
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"   // compara lexicográficamente

    println("'q' en 'a'..'z' -> ${'q' in charRange}")
    println("\"CCC\" en \"ABD\"..\"XYZ\" -> ${"CCC" in stringRange}")
    println("\"CCCCCC\" en \"ABD\"..\"XYZ\" -> ${"CCCCCC" in stringRange}")
    println("\"ZZZZZZ\" en \"ABD\"..\"XYZ\" -> ${"ZZZZZZ" in stringRange}")
}

// ===============================
// 05. Recorrer String (for-each de Char)
// ===============================
fun demo05_recorrerString() {
    printTitle("05. Recorrer String por caracteres")
    val str = "Hello"
    for (c in str) {
        println(c)
    }
    println("'e' in str -> ${'e' in str}")
    println("'e' !in str -> ${'e' !in str}")
}

// ===============================
// 06. Operadores in / !in con Int y colecciones
// ===============================
fun demo06_inNotIn() {
    printTitle("06. Operadores in / !in")
    val range = 1..10
    println("3 in 1..10 -> ${3 in range}")
    println("32 !in 1..10 -> ${32 !in range}")

    val seasons = arrayOf("spring", "summer", "winter", "fall")
    val notASeason = "whatever" !in seasons
    println("\"whatever\" !in seasons -> $notASeason")
}

// ===============================
// 07. for con índices y forEach/forEachIndexed
// ===============================
fun demo07_indicesYForEach() {
    printTitle("07. indices / forEach / forEachIndexed")
    val seasons = arrayOf("spring", "summer", "winter", "fall")

    println("Con indices:")
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    println("forEach:")
    seasons.forEach { println(it) }

    println("forEachIndexed:")
    seasons.forEachIndexed { index, value ->
        println("$value is season number $index")
    }
}

// ===============================
// 08. Construcción de rangos: downTo, step, reversed
// ===============================
fun demo08_construirRangos() {
    printTitle("08. downTo, step(), reversed()")
    val backwardRange = 5.downTo(1)
    println("backwardRange: ${backwardRange.joinToString()}")

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    println("stepThree (3..15 step 3): ${stepThree.joinToString()}")

    val range = 1..5
    val reversedRange = range.reversed()
    println("reversed(1..5): ${reversedRange.joinToString()}")
}

// ===============================
// 09. Bucles anidados y etiquetas (labels) con continue@label
// ===============================
fun demo09_etiquetasContinue() {
    printTitle("09. Labels con continue@jloop")
    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("  j = $j")
            for (k in 5..10) {
                println("    k = $k")
                if (k == 7) {
                    // Salta al siguiente 'j' (continúa el bucle etiquetado jloop)
                    continue@jloop
                }
            }
        }
    }
}

// ===============================
// 10. Ejemplo aplicado con String.length y rangos de índices
// ===============================
fun demo10_indicesDeString() {
    printTitle("10. Índices de String con rango")
    val s = "goodbye"
    // Ojo: los índices válidos son 0..s.length-1
    val sRange = 0 until s.length
    println("s = \"$s\"; indices válidos = $sRange")
    for (i in sRange) {
        println("s[$i] = ${s[i]}")
    }
}

/*
Sugerencia de orden de estudio:
1) demo01RangosBasicos
2) demo02StepYUntil
3) demo03DownTo
4) demo04_rangosCharYString
5) demo05_recorrerString
6) demo06_inNotIn
7) demo07_indicesYForEach
8) demo08_construirRangos
9) demo10_indicesDeString
10) demo09_etiquetasContinue   (más avanzado)
*/

// Nota: Si necesitas un punto de entrada, puedes crear temporalmente:
// fun main() { demo01_rangosBasicos() /* llama la que quieras */ }

fun main() {
    demo07_indicesYForEach()
}