package i_introduction._9_Data_Classes

import util.TODO

class Person1(val name: String, val age: Int)

fun create() = Person1("James Gosling", 58) //no 'new' keyword

fun useFromJava() {
    // property 'val name' = backing field + accessors (getter & setter)
    // => from Java you access it through 'getName()'
    JavaCode9().useKotlinClass(Person1("Martin Odersky", 55))
}

// It's the same as the following (excess code is generated):
class Person2(_name: String, _age: Int) { //_name, _age are constructor parameters
    val name: String = _name
      get() {
          return $name // you can access the backing field of property with '$' + property name
      }

    val age: Int = _age
      get() {
          return $age
      }
}

// If you add annotation 'data' for your class, some additional methods will be generated for you
// like 'equals', 'hashCode', 'toString'.

data class Person3(val name: String, val age: Int)

// This class is the same only 43 lines shorter than Java class Person4. =)

fun todoTask9() = TODO(
        task = "There is no task for you here. Just tell if you are delighted with Kotlin. =)",
        references = { JavaCode9.Person4("???", -1) }
)

fun task9(): Boolean = todoTask9()