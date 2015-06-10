package syntax.classesObjectsInterfaces

// interfaces in Kotlin are like Java8 interfaces (stateless but with implementations)
interface SimpleInterface {
    fun foo(): Int
    fun bar() = "default implementation ${foo()}"
}

// all classes and members by default are final
open class SimpleClass {
    open fun bar() = "other implementation"
}

// ':' means both 'overrides' and 'implements'
class Successor : SimpleInterface, SimpleClass() {
    override fun foo() = 1

    // if you inherit two implementations, you must override it
    override fun bar(): String = super<SimpleInterface>.bar() + super<SimpleClass>.bar()
}

// object is a singleton
object Singleton {
    fun foo() = 42
}

fun useObject() {
    Singleton.foo()
}

class Outer(private val bar : Int) {

    // classes can be nested in other classes
    class Nested() {
        fun foo() = 2
    }

    // inner class has a reference to an object of an outer class
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
    // except the cases with access to class' private members.
    companion object {
        fun newInstance() = ClassWithPrivateConstructor(9)
    }
}

fun useClassObject() {
    ClassWithPrivateConstructor.newInstance()
}

fun localClass() {
    // class or object can be declared locally in a function
    @data class Local(val i: Int, val s: String) {}
}