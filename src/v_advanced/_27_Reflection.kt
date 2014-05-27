package v_advanced.reflection

import kotlin.properties.Delegates
import util.TODO
import java.io.PrintStream

// Currently Kotlin reflection API is under development,
// but you can use java.lang.Class.
fun example(s: String) {
    val c1 = s.javaClass
    val c2 = javaClass<String>()
}

fun todoTask27() = TODO(
        """
        Task 27.
        Implement a function 'printDeclaredMembers()' below that takes a value of Any type as a parameter and
        prints to 'out' all its declared members (fields, methods and constructors).
    """
)

fun printDeclaredMembers(a: Any, out: PrintStream = System.out) {
    todoTask27()
}

//-----------------------------------

class A(val a: Int?)

class B(val b: Int?)

class C(var c: Int)

class D {
    val d: Int get() = 1
}

class E {
    val e : Int by Delegates.lazy { 42 }
}

class F {
    fun foo(s: String = "", a: Any = 1, d: Double = 1.0) {}
}

data class G(i: Int, val s: String, val d: Double)

fun main(args: Array<String>) {
    for (e in listOf(A(1), B(1), C(1), D(), E(), F(), G(1, "", 1.0))) {
        val eClass = e.javaClass
        println("## Class ${eClass.getName()}")
        printDeclaredMembers(e)
        println("----------------")
    }
}




