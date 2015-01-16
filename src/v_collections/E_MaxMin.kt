package v_collections

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length() }
}

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    // Return a customer who ordered maximum number of orders
    todoCollectionTask()
}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    // Return the most expensive ordered product
    todoCollectionTask()
}
