package i_introduction._13_Object_And_Companion_Object

import util.doc13

fun todoTask13(): Nothing = util.TODO(
        """
        Task 13.
        Kotlin supports creating thread-safe singletons, which can be useful in various situations.
        You can declare them using object keyword.
        When You want to use declared object, You don't need to add initializer.
        `val example = ObjectExample`

        Add `init { }` block, where You will increment `counterForCreation` property, and
        implement getter for `counterForGetter`, which should return it and increment by one.
        """,
        documentation = doc13()
)

object ObjectExample {
    var counterForCreation = 0
        private set

    var counterForGetter = 0
        get() = todoTask13()
        private set
}


