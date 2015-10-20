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
    // Usages are compiled to getter and setter invocations.
    // You can open "View -> Tool windows -> Kotlin" in IntelliJ to see the bytecode.
    val x = sp.property
    sp.property = x + 1
}

class PropertiesWithCustomAccessors {
    var generatedByDefault: Int = 0
        set(value: Int) { field = value }
        get() = field

    val propertyWithoutBackingField: Int
        get() = 42

    val infiniteRecursion: Int? = Random().nextInt()
        get() = if (field!! < 42) null else infiniteRecursion
}

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = todoTask18()
}

fun todoTask18(): Nothing = TODO(
    """
        Task 18.
        Add a custom setter to PropertyExample.propertyWithCounter so that
        the 'counter' property is incremented every time 'propertyWithCounter' is assigned to.
        Initialize 'propertyWithCounter' with null (the setter should NOT be invoked on initialization).
    """,
    references = { PropertyExample() }
)
