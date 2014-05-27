package i_introduction._10_Object_Expressions

import org.junit.Test as test
import org.junit.Assert
import java.awt.event.MouseEvent
import java.awt.Component

class _10_Object_Expressions {
    test fun testStringComparator() {
        val mouseEvent = MouseEvent(object : Component() {}, 0, 0L, 0, 0, 0, 1, false)
        val result = task10 { mouseListener ->
            mouseListener.mouseClicked(mouseEvent)
            mouseListener.mouseClicked(mouseEvent)
            mouseListener.mouseClicked(mouseEvent)
            mouseListener.mouseClicked(mouseEvent)
        }
        Assert.assertEquals("Mouse clicks should be counted: ", 4, result)
    }
}
