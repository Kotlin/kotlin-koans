package syntax.qualifiedThis

class Outer { // implicit label @Outer
    inner class Inner { // implicit label @Inner
        fun Int.foo() { // implicit label @foo
            use(this@Outer, this@Inner, this@foo)
            this == this@foo

            val fl: String.() -> Boolean = S@{
                use(this, this@S)
                this == this@S
            }

            val fl2 = { s: String ->
                this == this@foo
            }
        }
    }
}

interface A { fun a() {} }
interface B { fun b() {} }
interface C { fun c() {} }
fun B.foo(f: C.()->Unit) = f

fun labelsForExtensionFunctionLiterals(a: A, b: B) {
    with (a) A@{
        with (b) B@{
            foo {
                this == this@foo
                c()

                this@foo.c()
                this@B.b()
                this@A.a()
            }
        }
    }
}

fun use(vararg a: Any?) = a
