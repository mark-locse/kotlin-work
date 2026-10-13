// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess
import kotlin.text.minBy
import kotlin.text.maxBy

fun main(args: Array<String>) {
    // Add your code here
    val temperatures = fetchData(args[0])
    val lowest = temperatures.minBy { it.second }
    val highest = temperatures.maxBy { it.second }
    val average = temperatures.map {it.second}.average()
    println("Highest: $highest\n Lowest: $lowest")
    println("Average: %.2f".format(average))

}
