package ii_conventions

import junit.framework.Assert
import org.junit.Test as test

class _17_Invoke {
    test fun testTask17() {
        Assert.assertEquals(4, task17(Invokable()))
    }

    test fun testNumberOfInvocations() {
        val message = "The number of invocations is incorrect"
        fun testInvokable(numberOfInvocations: Int, invokeSeveralTimes: (Invokable) -> Invokable) {
            val invokable = Invokable()
            Assert.assertEquals(message, numberOfInvocations, invokeSeveralTimes(invokable).getNumberOfInvocations())
        }

        testInvokable(1) { it() }
        testInvokable(5) { it()()()()() }
        testInvokable(0) { it }
    }

    fun Invokable.invoke() = todoTask17()
    fun Invokable.getNumberOfInvocations() = todoTask17()
}
