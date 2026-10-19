// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    try {
        // Implement main program here
        val dataset = readData(args[0])
        val vari = variance(dataset)
        println("Variance: %.5f".format(vari))
    }
    catch (error: NoSuchFileException) {
        println("Invalid command line argument")
    }
}
