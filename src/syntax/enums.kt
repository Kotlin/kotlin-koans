package syntax.enums

enum class Day {
    MONDAY
    TUESDAY
    //...
}

enum class Color(val rgb : Int) {
    RED : Color(0xFF0000)
    GREEN : Color(0x00FF00)
    BLUE : Color(0x0000FF)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    }

    TALKING {
        override fun signal() = WAITING
    }

    abstract fun signal() : ProtocolState
}
