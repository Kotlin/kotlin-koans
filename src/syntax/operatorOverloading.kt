package syntax

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
fun usage1(a: A, b: B) {
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
    //the same as
    b1 = b1 + a
}

trait MyCollection<E> {
    fun contains(e: E): Boolean
}

fun usage2(c: MyCollection<A>, a: A) {
    a in c
    //translates to
    c.contains(a)

    a !in c
    //translates to
    !c.contains(a)
}

trait MyMap<K, V> {
    fun get(k: K): V
    fun set(k: K, v: V)
}

fun usage3(map: MyMap<A, B>, a: A, b: B) {
    map[a]
    //translates to
    map.get(a)

    map[a] = b
    //translates to
    map.set(a, b)
}