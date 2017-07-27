package ii_collections

fun example7() {
    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }

    result == mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc"))
}

fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
    // Return a map of the customers living in each city
    todoCollectionTask()
}
