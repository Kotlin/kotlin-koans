package iv_builders

import java.util.HashMap
import util.TODO
import iv_builders.htmlLibrary.html

// Extension function as a value

fun <T> with(t: T, body: T.() -> Unit) {
    t.body()
}

fun testWith() {
    val stringBuilder = StringBuilder()
    with(stringBuilder, { this.append("1") })

    with (stringBuilder) {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }
}

fun todoTask20() = TODO(
        task = """Task20.
        Uncomment commented code and make it compile.
        Implement method 'newMap', add an extension function MapBuilder.entry.
        The previous html example may help you. (At first try not to look at it).""",
        references = { MapBuilder(); newMap {  }; html { } }
)

class MapBuilder {
    val map = HashMap<Int, String>()
    fun build(): Map<Int, String> = map
}

fun newMap(init: MapBuilder.() -> Unit): MapBuilder {
    todoTask20()
}

fun createMapWithMapBuilder(): Map<Int, String> {
    return newMap {
//        entry(key = 0, value = "0")
//        for (i in 1..10) {
//            entry(key = i, value = "$i")
//        }
    }.build()
}
