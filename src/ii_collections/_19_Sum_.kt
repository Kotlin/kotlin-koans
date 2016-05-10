package ii_collections

fun example6() {
    val sum = listOf(1, 5, 3).sum()
}

/**
 * Description of task.
 */
fun todoTask19(): Nothing = util.TODO(
        """
        Task 19

        Task for working with collections.
        Look through the 'Shop' API; all tasks are connected with it.
        Return what is described in the name and the comment.
        """,
        references = { shop: Shop -> shop.customers }
)

fun Customer.getTotalOrderPrice(): Double {
    // Return the sum of prices of all products that a customer has ordered.
    // Note: a customer may order the same product for several times.
    todoTask19()
}
