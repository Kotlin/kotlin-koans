package syntax.classesObjectsInterfaces

// Interfaces in Kotlin are like Java8 interfaces, stateless but with implementations
interface SimpleInterface {
    fun foo(): Int
    fun bar() = "default implementation ${foo()}"
}

// All classes and members by default are final
open class SimpleClass {
    open fun bar() = "other implementation"
}

// ':' means both 'overrides' and 'implements'
class Successor : SimpleInterface, SimpleClass() {
    override fun foo() = 1

    // If you inherit two implementations of the same function, you must override that function
    override fun bar(): String = super<SimpleInterface>.bar() + super<SimpleClass>.bar()
}

// The use of 'object' instead of 'class' indicates a singleton declaration
object Singleton {
    fun foo() = 42
}

fun useObject() {
    Singleton.foo()
}

class Outer(private val bar : Int) {

    // Classes can be nested within other classes
    class Nested() {
        fun foo() = 2
    }

    // Inner classes may reference properties of their outer class instance
    inner class Inner() {
        fun foo() = bar
    }
}

fun demo() {
    Outer(1).Inner().foo() // == 1
    Outer.Nested().foo() // == 2
}

class ClassWithPrivateConstructor private constructor(val bar: Int) {

    // Classes do not have static methods.
    // In most cases, namespace-level functions form a good substitute for them,
    // except cases where access to class' private members is required.
    companion object {
        fun newInstance() = ClassWithPrivateConstructor(9)
    }
}

fun useClassObject() {
    ClassWithPrivateConstructor.newInstance()
}

fun localClass() {
    // A class or object can be declared locally in a function
    data class Local(val i: Int, val s: String) {}
}
