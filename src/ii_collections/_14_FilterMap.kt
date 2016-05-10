package ii_collections

fun example1(list: List<Int>) {
    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

/**
 * Description of task.
 */
fun todoTask14(): Nothing = util.TODO(
        """
        Task 14

        Task for working with collections.
        Look through the 'Shop' API; all tasks are connected with it.
        Return what is described in the name and the comment.
        """,
        references = { shop: Shop -> shop.customers }
)

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    // Return the set of cities the customers are from
    todoTask14()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    // Return a list of the customers who live in the given city
    todoTask14()
}
