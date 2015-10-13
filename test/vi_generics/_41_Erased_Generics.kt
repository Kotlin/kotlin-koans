package vi_generics

import org.junit.Test as test
import util.questions.Answer.*
import junit.framework.Assert
import vi_generics.generics.task27

class _41_Erased_Generics {
    @test fun testGenericsQuiz() {
        val answers = linkedMapOf(1 to b, 2 to a, 3 to c)
        Assert.assertEquals("Your answers are incorrect: ", answers, task27())
    }
}