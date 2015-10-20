package syntax.properties

import kotlin.properties.Delegates

data class SimpleDataClass(val i: Int, val s: String)

class A {
    var propertyWithCustomAccessors: Int = 1
        set(v: Int) {
            println("setter")
            field = v
        }
        get() {
            println("getter")
            return field
        }

    val propertyWithoutBackingField: Int
       get() = 42
}

// Extension properties cannot have a backing field
val String.size: Int
    get() = length

class B {
    val i: Int by Delegates.notNull()
}
