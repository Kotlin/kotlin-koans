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

    val description: String by todoTask17()
    var price: Int by todoTask17()
    var isAvailable: Boolean by todoTask17()
}

fun <T> todoTask17(): ReadWriteProperty<Commodity, T> = TODO(
        task = """Task17.
        Make the properties in class Commodity reflect the data storing in the map.
        The value of property 'price' should be the value in 'data' by the key "price".
        Use Delegates.mapVar""",
        references = {
            val data = hashMapOf<String, Any?>("description" to "snowboard", "price" to 349, "isAvailable" to true)
            Commodity(data)
            Delegates.mapVar<Any>(data)
        })
