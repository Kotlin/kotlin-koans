package i_introduction._6_Data_Classes

import util.TODO
import util.doc6

/**
 * Description of task.
 */
fun todoTask6(): Nothing = TODO(
        """
        Task 6

        The goal of this class is to learn out to simplify the Person class found in JavaCode6
        by writing it in Kotlin and placing the new simplified Person class here in this file by
        completing the definition of "class Person" found just below.

        To-do:
        * Complete the Person class (just below), your definition should fit on a single line
        * Make the class a "data" class to automatically have the compiler generate a bunch of
           useful methods in this class: `equals`/`hashCode`, `toString` and some others.
        * Modify the task6() function should return a list of Person. Uncomment the //return line
          and remove the todoTask6() line.
        """,
        documentation = doc6(),
        references = { JavaCode6.Person("Alice", 29) }
)

/**
 * The class to create as described in todoTask6()
 */
class Person

/**
 * Modify the function body of this method as described in todoTask6().
 * The //return line within task6()
 *
 * @return a list of two Person objects, one for Alice and one for Bob.
 */
fun task6(): List<Person> {
    todoTask6()
    //return listOf(/*Person("Alice", 29), Person("Bob", 31)*/)
}

