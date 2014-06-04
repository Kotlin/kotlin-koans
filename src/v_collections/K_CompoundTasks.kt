package v_collections

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    // Return the set of customers who ordered the specified product
    return customers.filter { it.orderedProducts.contains(product) }.toSet()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    // Return the most expensive among delivered products
    // (use Order.isDelivered flag)
    return orders.filter { it.isDelivered }.flatMap { it.products }.maxBy { it.price }
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    // Returns number of times each product was ordered.
    // Note: a customer may order the same product for several times.
    return customers.flatMap { it.getOrderedProductsList() }.count { it == product }
}

fun Customer.getOrderedProductsList(): List<Product> {
    return orders.flatMap { it.products }
}

