package iv_builders.htmlLibrary

import java.util.ArrayList

open class Tag(val name: String) {
    val children: MutableList<Tag> = ArrayList()
    val attributes: MutableList<Attribute> = ArrayList()
    override fun toString() =
            "<$name${attributes.makeStringIfNotEmpty(prefix = " ")}>${children.makeStringIfNotEmpty()}</$name>"
}

private fun <T> List<T>.makeStringIfNotEmpty(prefix: String = "") : String {
    return if (isEmpty()) "" else makeString(separator = "", prefix = prefix)
}

class Attribute(val name : String, val value : String) {
    override fun toString() = """$name="$value" """
}

fun <T: Tag> T.set(name: String, value: String?): T {
    if (value != null) {
        attributes.add(Attribute(name, value))
    }
    return this
}

fun <T: Tag> Tag.doInit(tag: T, init: T.() -> Unit): T {
    tag.init()
    children.add(tag)
    return tag
}

class Html: Tag("html")
class Table: Tag("table")
class Center: Tag("center")
class TR: Tag("tr")
class TD: Tag("td")
class Text(val text: String): Tag("b") {
    override fun toString() = text
}

fun html(init: Html.() -> Unit): Html {
    val tag = Html()
    tag.init()
    return tag
}

fun Html.table(init : Table.() -> Unit) = doInit(Table(), init)
fun Html.center(init : Center.() -> Unit) = doInit(Center(), init)

fun Table.tr(color: String? = null, init : TR.() -> Unit) = doInit(TR(), init).set("bgcolor", color)

fun TR.td(align : String = "left", color: String? = null, init : TD.() -> Unit) = doInit(TD(), init).set("align", align).set("bgcolor", color)

fun Tag.text(s : Any?) = doInit(Text(s.toString()), {})

