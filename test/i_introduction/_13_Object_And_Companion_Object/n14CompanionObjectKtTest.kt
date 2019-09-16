package i_introduction._13_Object_And_Companion_Object

import org.hamcrest.core.IsNot.not
import org.hamcrest.core.Is.`is` as isEqualTo
import org.junit.Assert.assertThat
import org.junit.Test

class n14CompanionObjectKtTest {

    @Test
    fun checkNumberOfInitialisations() {
        val objectExample = ExampleForCompanionObject()

        assertThat(objectExample.getCounter(), isEqualTo(0))
        assertThat(objectExample.getCounter(), isEqualTo(1))

        val secondInit = ExampleForCompanionObject()
        assertThat(secondInit.getCounter(), isEqualTo(2))

        assertThat(objectExample.hashCode(), not(isEqualTo(secondInit.hashCode())))
    }
}