package iii_conventions

import junit.framework.Assert
import org.junit.Test as test

class _17_Invoke {
    test fun testTask17() {
        Assert.assertEquals(4, task17(Foo()))
    }

    test fun testNumberOfInvocations() {
        val foo = Foo()
        Assert.assertEquals(1, foo().getNumberOfInvocations())
        Assert.assertEquals(5, foo()()()()().getNumberOfInvocations())
        Assert.assertEquals(0, foo.getNumberOfInvocations())
    }

    fun Foo.invoke() = todoTask17()
    fun Foo.getNumberOfInvocations() = todoTask17()
}
