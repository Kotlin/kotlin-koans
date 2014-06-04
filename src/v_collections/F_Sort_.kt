package v_collections

fun example5() {
    val result = listOf("a", "bbb", "cc").sortBy { it.length() }

    result == listOf("a", "cc", "bbb")
}

fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> {
    // Return customers sorted by number of orders they made
    return customers.sortBy { it.orders.size }
}
