package ii_collections

fun example() {
    val result = listOf("abc", "12").flatMap { it.toList() }
    result == listOf('a', 'b', 'c', '1', '2')
}

/**
 * Description of task.
 */
fun todoTask16(): Nothing = util.TODO(
        """
        Task 16

        Task for working with collections.
        Look through the 'Shop' API; all tasks are connected with it.
        Return what is described in the name and the comment.
        """,
        references = { shop: Shop -> shop.customers }
)

val Customer.orderedProducts: Set<Product> get() {
    // Return all products ordered by customer
    todoTask16()
}

val Shop.allOrderedProducts: Set<Product> get() {
    // Return all products that were ordered by at least one customer
    todoTask16()
}
