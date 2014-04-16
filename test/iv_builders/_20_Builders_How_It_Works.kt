package iv_builders

import junit.framework.Assert
import org.junit.Test as test
import iv_builders.Answer.*

class _20_Builders_How_It_Works {
    test fun testQuestionnaire() {
        val answers = linkedMapOf(1 to c, 2 to b, 3 to b, 4 to c)
        Assert.assertEquals("Your answers are incorrect: ", answers, task20())
    }
}