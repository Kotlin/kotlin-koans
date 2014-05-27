package v_advanced

import junit.framework.Assert
import org.junit.Test as test
import java.io.PrintStream
import java.io.ByteArrayOutputStream
import v_advanced.reflection.printDeclaredMembers

public class _27_Reflection {
    class Foo {
        val bar = 1
        fun baz() = 2
    }

    test fun testPrintDeclaredMembers() {
        val out = ByteArrayOutputStream()
        printDeclaredMembers(Foo(), PrintStream(out))
        val result = String(out.toByteArray())
        Assert.assertTrue("Declared functions should be printed: \n$result", result.contains("baz"))
        Assert.assertTrue("Declared fields should be printed:  \n$result", result.contains("bar"))
    }
}