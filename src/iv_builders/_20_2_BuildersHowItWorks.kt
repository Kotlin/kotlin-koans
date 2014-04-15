package iv_builders

import java.util.HashMap
import util.TODO
import iv_builders.htmlLibrary.html
import com.google.common.collect.Multimap
import com.google.common.collect.HashMultimap
import java.util.ArrayList

fun todoTask20_2() = TODO(
        task = """Task20.2.
        Uncomment commented code and make it compile.
        Implement method 'newMultiMap', add an extension function MultiMapBuilder.entry.
        You may need to add an extra class (ValuesBuilder).""",
        references = { MultiMapBuilder(); newMultiMap {  } }
)

class MultiMapBuilder {
    val multiMap = HashMultimap.create<Int, String>()!!
    fun build(): Multimap<Int, String> = multiMap
}

fun newMultiMap(init: MultiMapBuilder.() -> Unit): MultiMapBuilder {
    todoTask20_2()
}

fun createMultiMapWithMapBuilder(): Multimap<Int, String> {
    return newMultiMap {
//        entry(key = 0) {
//            value("")
//        }
//        entry(key = 1) {
//            for (i in 0..9) {
//                value("$i")
//            }
//        }
    }.build()
}
