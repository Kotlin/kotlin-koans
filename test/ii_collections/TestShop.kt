package ii_collections.data

import ii_collections.*

//products
val idea = Product("IntelliJ IDEA Ultimate", 199.0)
val reSharper = Product("ReSharper", 149.0)
val dotTrace = Product("DotTrace", 159.0)
val dotMemory = Product("DotMemory", 129.0)
val dotCover = Product("DotCover", 99.0)
val appCode = Product("AppCode", 99.0)
val phpStorm = Product("PhpStorm", 99.0)
val pyCharm = Product("PyCharm", 99.0)
val rubyMine = Product("RubyMine", 99.0)
val webStorm = Product("WebStorm", 49.0)
val teamCity = Product("TeamCity", 299.0)
val youTrack = Product("YouTrack", 500.0)

//customers
val lucas = "Lucas"
val cooper = "Cooper"
val nathan = "Nathan"
val reka = "Reka"
val bajram = "Bajram"
val asuka = "Asuka"
val riku = "Riku"

//cities
val Canberra = City("Canberra")
val Vancouver = City("Vancouver")
val Budapest = City("Budapest")
val Ankara = City("Ankara")
val Tokyo = City("Tokyo")

fun customer(name: String, city: City, vararg orders: Order) = Customer(name, city, orders.toList())
fun order(vararg products: Product, isDelivered: Boolean = true) = Order(products.toList(), isDelivered)
fun shop(name: String, vararg customers: Customer) = Shop(name, customers.toList())

val shop = shop("jb test shop",
        customer(lucas, Canberra,
                order(reSharper),
                order(reSharper, dotMemory, dotTrace)
        ),
        customer(cooper, Canberra),
        customer(nathan, Vancouver,
                order(rubyMine, webStorm)
        ),
        customer(reka, Budapest,
                order(idea, isDelivered = false),
                order(idea, isDelivered = false),
                order(idea)
        ),
        customer(bajram, Ankara,
                order(reSharper)
        ),
        customer(asuka, Tokyo,
                order(idea)
        ),
        customer(riku, Tokyo,
                order(phpStorm, phpStorm),
                order(phpStorm)
        )

)

val customers: Map<String, Customer> = shop.customers.fold(hashMapOf(), {
    map, customer ->
    map[customer.name] = customer
    map
})

val orderedProducts = setOf(idea, reSharper, dotTrace, dotMemory, rubyMine, webStorm, phpStorm)

val sortedCustomers = listOf(cooper, nathan, bajram, asuka, lucas, riku, reka).map { customers[it] }

val groupedByCities = mapOf(
        Canberra to listOf(lucas, cooper),
        Vancouver to listOf(nathan),
        Budapest to listOf(reka),
        Ankara to listOf(bajram),
        Tokyo to listOf(asuka, riku)
).mapValues { it.value.map { name -> customers[name] } }
