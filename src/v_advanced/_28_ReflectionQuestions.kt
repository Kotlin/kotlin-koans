package v_advanced.reflectionQuestions

import util.questions.doQuestionnaire
import util.questions.Question
import util.questions.Answer.*
import util.TODO

fun todoTask28() = TODO(
        """
        Task 28.
        Run 'Reflection Questions' configuration (or 'main' function declared below) and answer the questions.
        Run 'main' function from the previous question to see declared members for mentioned classes.
    """
)

fun main(args: Array<String>) {
    doQuestionnaire("Reflection",
            Question(
                    """
                        For the class
                            class A(val a: Int)
                        the generated constructors are:
                    """,
                    a to "public A(int)",
                    b to "public A(java.lang.Integer)",
                    c to "no constructors are generated"
            ),

            Question(
                    """
                        For the class
                            class B(val b: Int?)
                        the generated constructors are:
                    """,
                    a to "public B(int)",
                    b to "public B(java.lang.Integer)",
                    c to "no constructors are generated"
            ),

            Question(
                    """
                        For the class
                        class C(var c: Int)
                    """,
                    a to "public field and public getter and setter are generated",
                    b to "private field and public getter and setter are generated",
                    c to "only getter and setter are generated"
            ),

            Question(
                    """
                        For the class
                            class D {
                               val d: Int get() = 1
                            }
                    """,
                    a to "public field and public getter are generated",
                    b to "private field and public getter are generated",
                    c to "only getter is generated"
            ),

            Question(
                    """
                        For the class
                            class E {
                               val e : Int by Delegates.lazy { 42 }
                            }
                        the data for 'e' property
                    """,
                    a to "is stored in the field of type int",
                    b to "is stored in the field of type kotlin.properties.ReadOnlyProperty",
                    c to "isn't stored and is computed on demand"
            ),

            Question(
                    """
                        The function 'foo' with default arguments for parameters in the class 'F'
                            class F {
                                fun foo(s: String = "", c: Char = 'r', d: Double = 1.0) {}
                            }
                        can be invoked with different number of arguments:
                            f.foo(s = "s", c = '?') or f.foo()
                        To support this in bytecode:
                    """,
                    a to "8 overloaded functions named 'foo' are generated",
                    b to "only function foo(String, char, double) is generated",
                    c to "except foo only one adiitional special function foo\$default \n(with int flag as last argument) is generated"
            )
    )
}
