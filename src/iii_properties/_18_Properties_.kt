package iii_properties

import util.*

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = todoTask18()
}

fun todoTask18(): Nothing = TODO(
    """
        Task 18.
        Add a custom setter to PropertyExample.propertyWithCounter so that
        the 'counter' property is incremented every time 'propertyWithCounter' is assigned to.
    """,
    documentation = doc18(),
    references = { PropertyExample() }
)
