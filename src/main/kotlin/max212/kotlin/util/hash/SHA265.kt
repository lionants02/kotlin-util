package max212.kotlin.util.hash

import java.nio.charset.StandardCharsets.UTF_8
import java.security.MessageDigest

class SHA265 : Hash {
    override fun hash(plaintext: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val encodedHash = digest.digest(plaintext.toByteArray(UTF_8))
        return encodedHash.toHex() ?: ""
    }

    override fun check(plaintext: String, hash: String): Boolean {
        return hash(plaintext) == hash
    }

    private fun ByteArray.toHex(): String? {
        val hexString = StringBuffer()
        for (i in this.indices) {
            val hex = Integer.toHexString(0xff and this[i].toInt())
            if (hex.length == 1) hexString.append('0')
            hexString.append(hex)
        }
        return hexString.toString()
    }
}
