package syntax.operatorOverloading

fun compareStrings(s1: String?, s2: String?) {
    s1 == s2
    // translated to
    s1?.equals(s2) ?: s2.identityEquals(null)
}

trait C {
    fun compareTo(other: C): Int
}

fun test(c1: C, c2: C) {
    c1 < c2
    // translated to
    c1.compareTo(c2) < 0

    c1 >= c2
    // translated to
    c1.compareTo(c2) >= 0
}

trait A
trait B {
    //unary operations
    fun plus()
    fun minus()

    fun inc(): B
    fun dec(): B

    //binary operations
    fun plus(a: A): B
    fun minus(a: A): B
    fun times(a: A): B
    fun div(a: A): B
    fun mod(a: A): B
    fun rangeTo(a: A): B
}

[suppress("UNUSED_CHANGED_VALUE", "UNUSED_VALUE")]
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
    // translated to
    b1 = b1 + a
}

trait D {
    fun plusAssign(a: A)
    fun minusAssign(a: A)
    fun timesAssign(a: A)
    fun divAssign(a: A)
    fun modAssign(a: A)
}

fun assignmentOperations(d: D, a: A) {
    d += a
    // translated to
    d.plusAssign(a)
}

trait MyCollection<E> {
    fun contains(e: E): Boolean
}

fun conventionForIn(c: MyCollection<A>, a: A) {
    a in c
    //translated to
    c.contains(a)

    a !in c
    //translated to
    !c.contains(a)
}

trait MyMap<K, V> {
    fun get(k: K): V
    fun set(k: K, v: V)
}

fun conventionForGet(map: MyMap<A, B>, a: A, b: B) {
    map[a]
    //translated to
    map.get(a)

    map[a] = b
    //translated to
    map.set(a, b)
}