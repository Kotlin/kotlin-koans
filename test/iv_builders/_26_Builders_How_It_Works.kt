package iv_builders

import org.junit.Test as test
import iv_builders.builders.todoTask26
import util.questions.Answer.*
import junit.framework.Assert
import iv_builders.builders.task26

class _26_Builders_How_It_Works {
    test fun testBuildersQuiz() {
        val answers = linkedMapOf(1 to c, 2 to b, 3 to b, 4 to c)
        Assert.assertEquals("Your answers are incorrect: ", answers, task26())
    }
}