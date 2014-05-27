package iv_builders

import org.junit.Test as test
import iv_builders.builders.todoTask26
import util.testQuestionnaire

class _26_Builders_How_It_Works {
    test fun testBuildersQuestionnaire() {
        testQuestionnaire("Builders") { todoTask26() }
    }
}