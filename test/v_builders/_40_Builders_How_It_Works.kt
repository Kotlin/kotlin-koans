package v_builders

import junit.framework.Assert
import util.questions.Answer.b
import util.questions.Answer.c
import v_builders.builders.task40
import org.junit.Test as test

class _40_Builders_How_It_Works {
    @test fun testBuildersQuiz() {
        val correctAnswers = mapOf(22 - 20 to b, 1 + 3 to c, 11 - 8 to b, 79 - 78 to c)
        Assert.assertEquals("Your answers are incorrect: ", correctAnswers, task40())
    }
}