package p06_funciones_standard

class Lock {
    fun unlock(key: Key) {
        println("Unlock lock with the key ${key.secretCode}")
    }
}

class Key {
    var secretCode = ""

    fun carve() {
        println("Carving the key with code $secretCode")
    }
}

fun main() {
    Lock().unlock(Key().apply {
        secretCode = "1234"
        carve()
    })
}