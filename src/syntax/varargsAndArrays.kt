package syntax.varargs

fun use(vararg a: Any): Array<out Any> = a

fun test() {
    use(1, 2.1, "a")
}

fun useArray() {
    val asc = Array<Int>(5, { i -> i * i }) // Creates an array [0, 1, 4, 9, 16]

    val array = arrayOf(1, 2, 3, 4)
    array[1] = array[1] * 2 // No actual calls to get() and set() generated
    for (x in array) {
        // no iterator created
        print(x)
    }

    for (i in array.indices) {
        // no iterator created
        array[i] += 2
    }

    val i = 1
    if (i in array.indices) {
        // same as (i >= 0 && i < array.size)
        print(array[i])
    }
}

fun arraysOfPrimitives() {
    // For best performance on the JVM use specialized array classes
    val intArray: IntArray = intArrayOf(1, 2, 3)
}
