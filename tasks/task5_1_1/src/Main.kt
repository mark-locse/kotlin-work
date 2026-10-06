// Task 5.1.1: main program
import kotlin.system.exitProcess
fun main (args: Array<String>) {
    if (args.size !=2) {
        println("Invalid argument count.")
        exitProcess(1)
    }
    println(anagrams(args[0],args[1]))
}