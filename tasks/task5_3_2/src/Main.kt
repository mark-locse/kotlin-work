// Task 5.3.2: main program
import kotlin.system.exitProcess
import kotlin.String

fun main (args: Array<String>) {
    if(args.size != 1) {
        println("Invalid argument count.")
        exitProcess(1)
    }
    val count = args[0].substringBefore("d").toInt()
    val sides = args[0].substringAfter("d").toInt()
    rollDice(sides, count)
    
}