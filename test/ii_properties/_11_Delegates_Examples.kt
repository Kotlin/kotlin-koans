package ii_properties

import junit.framework.Assert
import org.junit.Test as test

class _11_Delegates_Examples {
    test fun testAlice() {
        val data = hashMapOf("name" to "Alice", "age" to 7, "gender" to true)
        val p = Person(data)
        Assert.assertEquals("Alice", p.name)
        Assert.assertEquals(7, p.age)
        Assert.assertEquals(true, p.gender)

        data["age"] = 8
        Assert.assertEquals(8, p.age)
    }
}