package i_introduction._1_Java_To_Kotlin_Converter

import org.junit.Assert.assertEquals
import org.junit.Test

class _01_Functions() {
    @Test fun collection() {
        assertEquals("{1, 2, 3, 42, 555}", task1(listOf(1, 2, 3, 42, 555)))
    }
}