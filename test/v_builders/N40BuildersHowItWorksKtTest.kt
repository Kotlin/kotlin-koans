package v_builders

import org.junit.Assert.fail
import org.junit.Test
import util.questions.Answer.b
import util.questions.Answer.c
import v_builders.builders.task40

class N40BuildersHowItWorksKtTest {
    @Test fun testBuildersQuiz() {
        val answers = task40()
        if (answers.values.toSet() == setOf(null)) {
            fail("Please specify your answers!")
        }
        val correctAnswers = mapOf(22 - 20 to b, 1 + 3 to c, 11 - 8 to b, 79 - 78 to c)
        if (correctAnswers != answers) {
            val incorrect = (1..4).filter { answers[it] != correctAnswers[it] }
            fail("Your answers are incorrect! $incorrect")
        }
    }
}