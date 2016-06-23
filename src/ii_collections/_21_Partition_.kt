package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

/**
 * Description of task.
 */
fun todoTask21(): Nothing = util.TODO(
        """
        Task 21

        Task for working with collections.
        Look through the 'Shop' API; all tasks are connected with it.
        Return what is described in the name and the comment.
        """,
        references = { shop: Shop -> shop.customers }
)

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    // Return customers who have more undelivered orders than delivered
    todoTask21()
}
