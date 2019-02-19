package iii_conventions

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class N31InvokeKtTest {
    @Test
    fun testTask17() {
        assertEquals(4, task31(Invokable()))
    }

    @Test
    fun testNumberOfInvocations() {
        val message = "The number of invocations is incorrect"
        fun testInvokable(numberOfInvocations: Int, invokeSeveralTimes: (Invokable) -> Invokable) {
            val invokable = Invokable()
            assertEquals(numberOfInvocations, invokeSeveralTimes(invokable).getNumberOfInvocations(), message)
        }

        testInvokable(1) { it() }
        testInvokable(5) { it()()()()() }
        testInvokable(0) { it }
    }

    operator fun Invokable.invoke(): Nothing = todoTask31()
    fun Invokable.getNumberOfInvocations(): Nothing = todoTask31()
}
