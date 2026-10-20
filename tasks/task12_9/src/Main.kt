// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate
fun main() {
    val person = Person.create("John", LocalDate(1990, 1, 1))
}