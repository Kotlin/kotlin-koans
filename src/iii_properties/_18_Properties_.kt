package iii_properties

import java.util.Random
import util.TODO

fun localVariables() {
    // immutable variable
    val i = 1
    // doesn't compile:
    // i = 2

    // mutable variable
    var j = 3
    j = 1765
}

class SimpleProperty {
    //In the bytecode the property corresponds to field + getter + setter (if it's mutable).
    var property: String = "42"
}

fun usage(sp: SimpleProperty) {
    //Usages are compiled to getter and setter invocations.
    //You can open "View -> Tool windows -> Kotlin" and see the bytecode.
    val x = sp.property
    sp.property = x + 1
}

class PropertiesWithCustomAccessors {
    var generatedByDefault: Int = 0
        set(value: Int) { $generatedByDefault = value }
        get() = $generatedByDefault

    val propertyWithoutBackingField: Int
        get() = 42

    val infiniteRecursion: Int? = Random().nextInt()
        get() = if ($infiniteRecursion!! < 42) null else infiniteRecursion
}

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(v: Int?) {
            $propertyWithCounter = v
            counter++
        }

}

fun todoTask18() = TODO(
    """
        Task 18.
        Add custom setter to PropertyExample.propertyWithCounter so that
        it increments the 'counter' property every time 'propertyWithCounter' is assigned to.
        Initialize 'propertyWithCounter' with 'null' ('setter' is NOT invoked on initialization).
    """,
    references = { PropertyExample() }
)