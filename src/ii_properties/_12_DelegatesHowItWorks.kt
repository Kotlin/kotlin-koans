package ii_properties

import kotlin.properties.ReadWriteProperty
import util.TODO
import java.util.Calendar
import iii_conventions.MyDate

fun todoTask12() = TODO(
        task = """Task12.
        Implement the members of the class 'EffectiveDate' so it could be delegated to.
        Store only time in milliseconds in 'timeInMillis' property.
        Use extension functions 'Date.ToMillis' and 'Long.ToDate'.""",
        references = { (date: MyDate) -> date.toMillis().toDate()}
)

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {
    var timeInMillis: Long? = null

    override fun get(thisRef: R, desc: PropertyMetadata): MyDate = todoTask12()
    override fun set(thisRef: R, desc: PropertyMetadata, value: MyDate) = todoTask12()
}

class D {
    var date by EffectiveDate()
    //The property date$delegate of type EffectiveDate is created;
    //generated 'get' and 'set' accessors for 'date' are delegated to it.
    //Browse Kotlin tool window for details.
}

fun MyDate.toMillis(): Long {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    return c.getTimeInMillis()
}

fun Long.toDate(): MyDate {
    val c = Calendar.getInstance()
    c.setTimeInMillis(this)
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}
