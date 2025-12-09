package p14_other_features

fun selectPrimeNumber(primes: List<Int>) = primes.random()

fun main() {
    lateinit var message: String
    var primesNumbers = listOf(2, 3, 5, 7, 11, 13, 17, 23)
    message = "The chosen prime number is ${selectPrimeNumber(primesNumbers)}"
    println(message)
}