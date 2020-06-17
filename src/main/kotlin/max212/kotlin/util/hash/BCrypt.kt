package max212.kotlin.util.hash

import org.mindrot.jbcrypt.BCrypt

class BCrypt(private val genSalt: Int) : Hash {

    override fun hash(plaintext: String): String {
        val salt = BCrypt.gensalt(genSalt)
        return BCrypt.hashpw(plaintext, salt)
    }

    override fun check(plaintext: String, hash: String): Boolean {
        return BCrypt.checkpw(plaintext, hash)
    }
}
