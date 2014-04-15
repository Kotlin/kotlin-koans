package iv_builders

import java.util.HashMap
import util.TODO
import iv_builders.htmlLibrary.html
import com.google.common.collect.Multimap
import com.google.common.collect.HashMultimap
import java.util.ArrayList

fun todoTask20_1() = TODO(
    """
        Task20.1.
        Uncomment commented code and make it compile.
        Implement method 'newMap', add an extension function MapBuilder.entry.
        The previous html example may help you. (At first try not to look at it).
    """,
    references = { MapBuilder(); newMap {  }; html { } }
)

class MapBuilder {
    val map = HashMap<Int, String>()
    fun build(): Map<Int, String> = map
}

fun newMap(init: MapBuilder.() -> Unit): MapBuilder {
    todoTask20_1()
}

fun createMapWithMapBuilder(): Map<Int, String> {
    return newMap {
//        entry(key = 0, value = "0")
//        for (i in 1..10) {
//            entry(key = i, value = "$i")
//        }
    }.build()
}