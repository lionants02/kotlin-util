package max212.kotlin.util.hash

import org.amshove.kluent.`should be equal to`
import org.junit.Test

internal class SHA265Test {
    val hash = SHA265()
    val exam1 = "3zCwrRVKYTZhzxwY83NqtN59tVARgN2G"
    val exam2 = """Hj8^E3v%?vnq?N6n5V6?n3qswxLSB=Va"""

    @Test
    fun hash() {
        hash.hash(exam1) `should be equal to` "09fd51f5ecb4e7102241afb6e2586548357187dedaf32320e0f7ee430525535d"
        hash.hash(exam2) `should be equal to` "a4ce318f4972dd95a8ce14a5d664e5eb190b4ca459b75e5160c15ac7f000afcb"
    }

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
