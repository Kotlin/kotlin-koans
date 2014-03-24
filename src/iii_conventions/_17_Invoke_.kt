package iii_conventions

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

// click 'Ctrl + B' on round bracket to navigate to 'invoke'

// you can add invoke extension for any class,
// but it's better not to be mad about it
fun Int.invoke() { println(this) }

fun testTypeWithInvokeExtension() {
    1() //wtf?..
}

class Foo

fun todoTask17() = TODO(
        task = """Task17.
        Change class Foo to count the number of invocations (round brackets).
        Uncomment the commented code, it should return 4.""",
        references = {(foo: Foo) -> })

fun task17(foo: Foo): Int {
    todoTask17()
//    return foo()()()().getNumberOfInvocations()
}