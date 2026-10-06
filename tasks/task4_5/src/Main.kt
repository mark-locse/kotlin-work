// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size !=1) {
        print("Invalid argument count.")
        exitProcess(1)
    }
    val max = args[0].toInt()
    var sum = 0
    for (n in 1..max step 2) {
        sum += n
    }
    println("Sum: ${sum}")
}
