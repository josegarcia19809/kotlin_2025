package p14_other_features

fun getNetworkService2() = "Network service"

fun main() {
    lateinit var networkService: String
    networkService = getNetworkService2()
    println(networkService)
}