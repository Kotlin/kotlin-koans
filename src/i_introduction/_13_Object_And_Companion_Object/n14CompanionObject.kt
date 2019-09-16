package i_introduction._13_Object_And_Companion_Object

import util.doc14

fun todoTask14(): Nothing = util.TODO(
        """
        Task 14.
        Similar behaviour have companion object.
        It needs to be declared inside class and can implement interfaces or extends classes.
        They can be use ie. for fabric method.
        When integrating with Java code, sometimes We need to declare static functions, which We don't have in Kotlin.
        Then We can use annotation `@JvmStatic`, but it can be use only inside objects on properties
        or in companion objects on both functions ad properties.

        Add companion object inside class below with property.
        Make function `getCounter()` return it and increment by one.
        """,
        documentation = doc14()
)

class ExampleForCompanionObject {

    fun getCounter(): Int = todoTask14()
}
