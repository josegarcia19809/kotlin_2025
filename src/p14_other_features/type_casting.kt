package p14_other_features

import kotlin.random.Random

open class NetworkService {}
class FTPService : NetworkService() {
    fun transferFile() {
        println("transferring a file via FTP")
    }
}

fun getNetworkService(): NetworkService {
    return if (Random.nextInt() % 2 == 0)
        NetworkService()
    else
        FTPService()
}

fun main() {
    for (i in 1..10) {
        print("$i. ")
        val service = getNetworkService()
        (service as? FTPService)?.transferFile()
        println()
    }
}