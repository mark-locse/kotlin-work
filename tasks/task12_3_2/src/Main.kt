// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(2000, 1, 2)
    val person = Person("John", date).apply { isMarried = true }
    println(person.name)
    println(person.birth)
    println(person.isMarried)
}