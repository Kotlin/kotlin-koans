package ii_conventions

import util.TODO

trait My {
    fun invoke(i: Int)
}

// objects with 'invoke' function can by invokable as a function
fun testTypeWithInvokeMember(my: My) {
    my(1)

    // the same as
    my.invoke(1)
}

fun testFunctionType(f: (Int) -> Int) {
    // actually 'invoke' member is declared in a function type
    f.invoke(1)
    f(1)
}

// Press 'Ctrl + B' on round bracket to navigate to 'invoke'

// you can add invoke extension for any class,
// but it's better not to overdo it
fun Int.invoke() { println(this) }

fun testTypeWithInvokeExtension() {
    1() //huh?..
}

class Invokable(private var invocations: Int = 0) {
    fun invoke(): Invokable {
        invocations++
        return this
    }

    fun getNumberOfInvocations() = invocations
}


fun todoTask17() = TODO(
    """
        Task 17.
        Change class Invokable to count the number of invocations (round brackets).
        Uncomment the commented code, it should return 4.
    """,
    references = { invokable: Invokable -> })

fun task17(invokable: Invokable): Int {
//    todoTask17()
    return invokable()()()().getNumberOfInvocations()
}