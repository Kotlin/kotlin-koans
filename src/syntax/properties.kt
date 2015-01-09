package syntax.properties

import kotlin.properties.Delegates

data class SimpleDataClass(val i: Int, val s: String)

class A {
    var propertyWithCustomAccessors: Int = 1
        set(v: Int) {
            println("setter")
            $propertyWithCustomAccessors = v
        }
        get() {
            println("getter")
            return $propertyWithCustomAccessors
        }

    val propertyWithoutBackingField: Int
       get() = 42
}

// extension property cannot have a backing field
val String.size: Int
    get() = length()

class B {
    val i: Int by Delegates.notNull()
}