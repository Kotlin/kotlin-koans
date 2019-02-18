package v_builders.data

data class Product(val description: String, val price: Double, val popularity: Int)

val cactus = Product("cactus", 11.2, 13)
val cake = Product("cake", 3.2, 111)
val camera = Product("camera", 134.5, 2)
val car = Product("car", 30000.0, 0)
val carrot = Product("carrot", 1.34, 5)
val cellPhone = Product("cell phone", 129.9, 99)
val chimney = Product("chimney", 190.0, 2)
val certificate = Product("certificate", 99.9, 1)
val cigar = Product("cigar", 8.0, 51)
val coffee = Product("coffee", 8.0, 67)
val coffeeMaker = Product("coffee maker", 201.2, 1)
val cola = Product("cola", 4.0, 67)
val cranberry = Product("cranberry", 4.1, 39)
val crocs = Product("crocs", 18.7, 10)
val crocodile = Product("crocodile", 20000.2, 1)
val cushion = Product("cushion", 131.0, 0)

fun getProducts() = listOf(cactus, cake, camera, car, carrot, cellPhone, chimney, certificate, cigar, coffee, coffeeMaker,
    cola, cranberry, crocs, crocodile, cushion)