package max212.kotlin.util.hash

interface Hash {
    fun hash(plan: String): String
    fun check(plan: String, hash: String): Boolean
}
