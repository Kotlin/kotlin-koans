package ii_collections

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length }
}

/**
 * Description of task.
 */
fun todoTask17(): Nothing = util.TODO(
        """
        Task 17

        Task for working with collections.
        Look through the 'Shop' API; all tasks are connected with it.
        Return what is described in the name and the comment.
        """,
        references = { shop: Shop -> shop.customers }
)

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    // Return a customer whose order count is the highest among all customers
    todoTask17()
}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    // Return the most expensive product which has been ordered
    todoTask17()
}
