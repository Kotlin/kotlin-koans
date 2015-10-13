package ii_collections.shopBuilders

import ii_collections.*

class ShopBuilder(val name: String) {
    val customers = arrayListOf<Customer>()
    fun build(): Shop = Shop(name, customers)
}

fun shop(name: String, init: ShopBuilder.() -> Unit): Shop {
    val shopBuilder = ShopBuilder(name)
    shopBuilder.init()
    return shopBuilder.build()
}

fun ShopBuilder.customer(name: String, city: City, init: CustomerBuilder.() -> Unit) {
    val customer = CustomerBuilder(name, city)
    customer.init()
    customers.add(customer.build())
}

class CustomerBuilder(val name: String, val city: City) {
    val orders = arrayListOf<Order>()
    fun build(): Customer = Customer(name, city, orders)
}

fun CustomerBuilder.order(isDelivered: Boolean, vararg products: Product) {
    orders.add(Order(products.toList(), isDelivered))
}

fun CustomerBuilder.order(vararg products: Product) = order(true, *products)

