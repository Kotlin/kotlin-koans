package syntax.operatorOverloading

fun compareStrings(s1: String?, s2: String?) {
    s1 == s2
    // is compiled to
    s1?.equals(s2) ?: s2 === null
}

interface C {
    operator fun compareTo(other: C): Int
}

fun test(c1: C, c2: C) {
    c1 < c2
    // is compiled to
    c1.compareTo(c2) < 0

    c1 >= c2
    // is compiled to
    c1.compareTo(c2) >= 0
}

interface A
interface B {
    //unary operations
    operator fun unaryPlus()
    operator fun unaryMinus()

    operator fun inc(): B
    operator fun dec(): B

    //binary operations
    operator fun plus(a: A): B
    operator fun minus(a: A): B
    operator fun times(a: A): B
    operator fun div(a: A): B
    operator fun mod(a: A): B
    operator fun rangeTo(a: A): B
}

@Suppress("UNUSED_CHANGED_VALUE", "UNUSED_VALUE")
fun binaryAndUnaryOperations(a: A, b: B) {
    +b
    -b

    b + a
    b - a
    b * a
    b / a
    b % a
    b..a

    var b1 = b
    b1++
    b1--

    b1 += a
    // is compiled to
    b1 = b1 + a
}

interface D {
    operator fun plusAssign(a: A)
    operator fun minusAssign(a: A)
    operator fun timesAssign(a: A)
    operator fun divAssign(a: A)
    operator fun modAssign(a: A)
}

fun assignmentOperations(d: D, a: A) {
    d += a
    // is compiled to
    d.plusAssign(a)
}

interface MyCollection<E> {
    operator fun contains(e: E): Boolean
}

fun conventionForIn(c: MyCollection<A>, a: A) {
    a in c
    // is compiled to
    c.contains(a)

    a !in c
    // is compiled to
    !c.contains(a)
}

interface MyMap<K, V> {
    operator fun get(k: K): V
    operator fun set(k: K, v: V)
}

fun conventionForGet(map: MyMap<A, B>, a: A, b: B) {
    map[a]
    // is compiled to
    map.get(a)

    map[a] = b
    // is compiled to
    map.set(a, b)
}