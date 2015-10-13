package v_builders

import org.junit.Test
import v_builders.builders.todoTask40
import util.questions.Answer.*
import junit.framework.Assert
import v_builders.builders.task40

class _40_Builders_How_It_Works {
    @Test fun testBuildersQuiz() {
        val correctAnswers = mapOf(22 - 20 to b, 1 + 3 to c, 11 - 8 to b, 79 - 78 to c)
        Assert.assertEquals("Your answers are incorrect: ", correctAnswers, task40())
    }
}