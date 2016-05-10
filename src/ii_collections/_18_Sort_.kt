package ii_collections

fun example5() {
    val result = listOf("a", "bbb", "cc").sortedBy { it.length }
    result == listOf("a", "cc", "bbb")
}

/**
 * Description of task.
 */
fun todoTask18(): Nothing = util.TODO(
        """
        Task 18

        Task for working with collections.
        Look through the 'Shop' API; all tasks are connected with it.
        Return what is described in the name and the comment.
        """,
        references = { shop: Shop -> shop.customers }
)

fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> {
    // Return a list of customers, sorted by the ascending number of orders they made
    todoTask18()
}
