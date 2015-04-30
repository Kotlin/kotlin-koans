package syntax.forWhileLoops

fun forLoop(collection: Collection<String>) {
    for (i in 1..10) {}

    for (s in collection) {}

    for ((index, s) in collection.withIndex()) {}
}

fun iteratingOverMap(map: Map<Int, String>) {
    for ((key, value) in map) {}
}

fun whileLoop() {
    while (true) {
    }
}

fun doWhileLoop() {
    do {

    } while (true)
}

fun labels() {
    outerLoop@ while (true) {
        innerLoop@ for (i in 1..10) {
            if (i < 10) {
                continue@innerLoop
            }
            else {
                break@outerLoop
            }
        }
    }
}

