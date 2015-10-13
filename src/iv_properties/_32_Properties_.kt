package iv_properties

import util.*

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = todoTask32()
}

fun todoTask32() = TODO(
    """
        Task 32.
        Add a custom setter to PropertyExample.propertyWithCounter so that
        the 'counter' property is incremented every time 'propertyWithCounter' is assigned to.
    """,
    documentation = doc32(),
    references = { PropertyExample() }
)
