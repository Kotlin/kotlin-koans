package i_introduction._1_Java_To_Kotlin_Converter

import kotlin.test.*
import org.junit.Test as test
import org.junit.Assert

class _01_Functions() {
    @test fun collection() {
        Assert.assertEquals("{1, 2, 3, 42, 555}", task1(listOf(1, 2, 3, 42, 555)))
    }
}