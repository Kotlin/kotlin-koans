package iv_properties

import util.TODO
import util.doc34

class LazyPropertyUsingDelegates(val initializer: () -> Int) {
    val lazyValue: Int by todoTask34(initializer)
}

fun todoTask34(initializer: () -> Int): Lazy<Int>  {
    return lazy { initializer() }
}
