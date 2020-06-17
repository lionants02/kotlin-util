package max212.kotlin.util.hash

import org.amshove.kluent.`should be equal to`
import org.junit.Test

internal class BCryptTest {

    val hash = BCrypt(9)
    val exam1 = "3zCwrRVKYTZhzxwY83NqtN59tVARgN2G"
    val exam2 = """Hj8^E3v%?vnq?N6n5V6?n3qswxLSB=Va"""

    @Test
    fun validCheck() {
        hash.check(exam1, hash.hash(exam1)) `should be equal to` true
        hash.check(exam2, hash.hash(exam2)) `should be equal to` true
    }

    @Test
    fun invalidCheck() {
        hash.check(exam1, hash.hash(exam2)) `should be equal to` false
        hash.check(exam2, hash.hash(exam1)) `should be equal to` false
    }
}
