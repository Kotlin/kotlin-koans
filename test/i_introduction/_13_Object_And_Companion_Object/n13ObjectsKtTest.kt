package i_introduction._13_Object_And_Companion_Object

import org.junit.Assert.assertThat
import org.junit.Test
import org.hamcrest.core.Is.`is` as isEqualTo

class n13ObjectsKtTest {

    @Test fun checkNumberOfInitialisations() {
        val objectExample = ObjectExample

        assertThat(objectExample.counterForCreation, isEqualTo(1))
        assertThat(objectExample.counterForGetter, isEqualTo(0))
        assertThat(objectExample.counterForGetter, isEqualTo(1))

        val secondInit = ObjectExample
        assertThat(secondInit.counterForCreation, isEqualTo(1))
        assertThat(secondInit.counterForGetter, isEqualTo(2))

        assertThat(objectExample.hashCode(), isEqualTo(secondInit.hashCode()))
    }
}