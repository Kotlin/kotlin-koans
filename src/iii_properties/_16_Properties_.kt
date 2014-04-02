package iii_properties

import java.util.Random
import util.TODO

fun localVariables() {
    // immutable reference
    val i = 1
    // doesn't compile:
    // i = 2

    // mutable reference
    var j = 3
    j = 1765
}

class SimpleProperty {
    //In the bytecode the property corresponds to field + getter + setter (if it's mutable).
    var property: String = "42"
}

fun usage(sp: SimpleProperty) {
    //All usages are compiled to getter and setter invocations.
    //You can open "View -> Tool windows -> Kotlin" and see the bytecode.
    val x = sp.property
    sp.property = x + 1
}

class PropertiesWithCustomAccessors {
    private var counter = 0
    var propertyWithCounter: String = ""
        //default getter is generated
        set(v: String) {
            $propertyWithCounter = v
            counter++
        }

    val propertyWithoutBackingField: Int
        get() = 42

    val infiniteRecursion: Int? = Random().nextInt()
        get() = if ($infiniteRecursion!! < 42) null else infiniteRecursion
}

class LazyProperty(initializer: () -> Int) {
    val lazy: Int = todoTask16()

}

fun todoTask16() = TODO(
        task = """Task16.
        Make the 'lazy' val really lazy. It should be initialized by 'initializer()' invocation
        at the moment of the first access. You can add as many additional properties as you need.
        Do not use Delegates ;).
        """,
        references = { LazyProperty({ 42 }).lazy }
)
