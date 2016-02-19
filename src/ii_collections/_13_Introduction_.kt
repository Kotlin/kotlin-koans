package ii_collections

import java.util.*

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/**
 * Task 13.
 *
 * In Kotlin, there are many operations that help to transform one collection into another, starting with 'to'.
 *
 * The goal of this exercise is to replace the entire body (blow) of function Shop.getSetOfCustomers()
 * to return a set of all customers of Shop.
 *
 * This function, Shop.getSetOfCustomers(), adds a new function getSetOfCustomers() to the existing Shop class.
 * You can find the Shop.kt class in the same folder as this exercise (and all of the other
 * section ii_collections exercises).
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

