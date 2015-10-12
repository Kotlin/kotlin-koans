package iii_properties

import util.*
import kotlin.properties.ReadWriteProperty

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
        data
    }
)
