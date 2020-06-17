package max212.kotlin.util.hash

interface Hash {
    fun hash(plaintext: String): String
    fun check(plaintext: String, hash: String): Boolean
}
