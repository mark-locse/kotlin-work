// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        print("Invalid argument count.")
        exitProcess(1)
    }
    val arg1 = args[0].toInt()
    val arg2 = args[1].toInt()
    val arg3 = args[2].toInt()
    val average = ((arg1+arg2+arg3)/3).toFloat().roundToInt()
    val grade = when (average) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "?" 
    }
    println("Grade: %s".format(grade))
}

