package iii_conventions

import org.junit.Assert.assertEquals
import org.junit.Test

class _31_Invoke {
    @Test fun testTask17() {
        assertEquals(4, task31(Invokable()))
    }

    @Test fun testNumberOfInvocations() {
        val message = "The number of invocations is incorrect"
        fun testInvokable(numberOfInvocations: Int, invokeSeveralTimes: (Invokable) -> Invokable) {
            val invokable = Invokable()
            assertEquals(message, numberOfInvocations, invokeSeveralTimes(invokable).getNumberOfInvocations())
        }

        testInvokable(1) { it() }
        testInvokable(5) { it()()()()() }
        testInvokable(0) { it }
    }

    operator fun Invokable.invoke(): Nothing = todoTask31()
    fun Invokable.getNumberOfInvocations(): Nothing = todoTask31()
}
