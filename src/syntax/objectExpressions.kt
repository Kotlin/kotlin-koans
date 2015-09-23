package syntax.objectExpressions

import util.YourOldJavaCodeUsingRunnable

fun objectLiteral() {
    // Anonymous class can be created with an object expression
    YourOldJavaCodeUsingRunnable.run(object : Runnable {
        override fun run() {
            // ...
        }
    })
}

fun functionLiteral() {
    // If you invoke a Java method that requires Java interface as a parameter
    // that has only one single abstract method (this means SAM conversion is possible),
    // you can use a lambda instead
    YourOldJavaCodeUsingRunnable.run {
        // ...
    }

    // For every SAM interface defined in Java, Kotlin has a constructor function
    // that you can use to create instances of that SAM-interface, passing in a lambda
    val runnable = Runnable {
        // ...
    }
    YourOldJavaCodeUsingRunnable.run(runnable)
}
