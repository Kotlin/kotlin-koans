package iii_properties

import kotlin.properties.Delegates
import util.TODO
import kotlin.properties.ReadWriteProperty

class A(initializer: () -> Int) {

    val lazy: Int by Delegates.lazy(initializer)
}

class B() {

    var notNull: Int by Delegates.notNull()

    //If the property is accessed without initialization, an exception is thrown.
    fun foo() = notNull
}

class Commodity(data: MutableMap<String, Any?>) {

    val description: String by todoTask20()
    var price: Int by todoTask20()
    var isAvailable: Boolean by todoTask20()
}

fun <T> todoTask20(): ReadWriteProperty<Commodity, T> = TODO(
    """
        Task 20.
        Make the properties in class Commodity reflect the data stored in the map.
        E.g., the value of property 'price' should be the value in 'data' by the key "price".
        Use Delegates.mapVar().
    """,
    references = {
        val data = hashMapOf<String, Any?>("description" to "snowboard", "price" to 349, "isAvailable" to true)
        Commodity(data)
        Delegates.mapVar<Any>(data)
    }
)
