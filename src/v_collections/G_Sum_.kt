package v_collections

fun example6() {
    val sum = listOf(1, 5, 3).sum()
}

fun Customer.getTotalOrderPrice(): Double {
    // Returns the sum of prices of all products ordered by customer.
    // Note: a customer may order the same product for several times.
    return orders.flatMap { it.products }.map { it.price }.sum()
}
