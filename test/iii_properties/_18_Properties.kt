package iii_properties

import junit.framework.Assert
import org.junit.Test as test

class _18_Properties {
    test fun testPropertyWithCounter() {
        val q = PropertyExample()
        q.propertyWithCounter = 14
        q.propertyWithCounter = 21
        q.propertyWithCounter = 32
        Assert.assertEquals("The property q.changeCounter should contain the number of assignments to q.propertyWithCounter:",
                3, q.counter)
        Assert.assertEquals("The property q.propertyWithCounter should be set:", 32, q.propertyWithCounter)
    }

}