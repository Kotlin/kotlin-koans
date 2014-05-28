package ii_collections

fun example1(list: List<Int>) {

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

fun Shop.getCitiesCustomersAreFrom(): Set<City> {
    // Return the set of cities the customers are from
    return customers.map { it.city }.toSet()
}

fun Shop.getCustomersFrom(city: City): List<Customer> {
    // Return a list of the customers who live in the given city
    return customers.filter { it.city == city }
}


