package ii_collections

import java.util.HashSet
import util.TODO

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/*
 *  For easy java compatibility we don't introduce our own collections, but use standard Java ones.
 *  However there are two representations of them: mutable and read-only.
 */

fun useReadonlySet(set: Set<Int>) {
    // doesn't compile:
    //    set.add(1)
}

fun useMutableSet(set: MutableSet<Int>) {
    set.add(1)
}

/*
 *  There are many operations that help to transform one collection into another, starting with 'to'
 */
fun example0(list: List<Int>) {
    list.toSet()

    val set = HashSet<Int>()
    list.to(set)
}

fun Shop.getSetOfCustomers(): Set<Customer> {
    // Return a set containing all the customers of this shop
    todoCollectionTask()
//    return this.customers
}

