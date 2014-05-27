package v_advanced

import org.junit.Test as test
import util.testQuestionnaire
import v_advanced.reflectionQuestions.todoTask28

public class _28_Reflection_Questions {
    test fun testBuildersQuestionnaire() {
        testQuestionnaire("Builders") { todoTask28() }
    }
}