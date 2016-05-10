package ii_collections

fun example7() {
    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }
    result == mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc"))
}

/**
 * Description of task.
 */
fun todoTask20(): Nothing = util.TODO(
        """
        Task 20

        Task for working with collections.
        Look through the 'Shop' API; all tasks are connected with it.
        Return what is described in the name and the comment.
        """,
        references = { shop: Shop -> shop.customers }
)

fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
    // Return a map of the customers living in each city
    todoTask20()
}
