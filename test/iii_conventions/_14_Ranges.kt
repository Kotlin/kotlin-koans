package iii_conventions

import junit.framework.Assert
import org.junit.Test as test
import iii_conventions.TimeInterval.*

class _14_Ranges {
    test fun testInRange() {
        Assert.assertTrue(checkInRange(Date(2014, 3, 22), Date(2014, 1, 1), Date(2015, 1, 1)))
    }

    test fun testNotInRange() {
        Assert.assertFalse(checkInRange(Date(2013, 3, 22), Date(2014, 1, 1), Date(2015, 1, 1)))
        Assert.assertFalse(checkInRange(Date(2015, 3, 22), Date(2014, 1, 1), Date(2015, 1, 1)))
    }
}