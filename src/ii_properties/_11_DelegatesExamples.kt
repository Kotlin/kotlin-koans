package ii_properties

import kotlin.properties.Delegates
import util.TODO
import kotlin.properties.ReadOnlyProperty
import java.util.HashMap

class A(initializer: () -> Int) {

    val lazy: Int by Delegates.lazy(initializer)
}

class B() {

    var notNull: Int by Delegates.notNull()

    //If the property is accessed without initialization, an exception is thrown.
    fun foo() = notNull
}

class Person(data: Map<String, Any?>) {

    val name: String by todoTask11()
    val age: Int by todoTask11()
    val gender: Boolean by todoTask11()
}

fun <T> todoTask11(): ReadOnlyProperty<Person, T> = TODO(
        task = """Task11.
        Make the properties reflect the data storing in the map.
        The value of property 'name' should be the value in 'data' by the key "name".
        Use Delegates.""",
        references = { Person(hashMapOf("name" to "Alice", "age" to 7, "gender" to true)); Delegates })
