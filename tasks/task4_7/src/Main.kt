// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.*

fun main (args: Array<String>) {
    if (args.size != 1) {
        print("Invalid argument count.")
        exitProcess(1)
    }
    val filePath = Path(args[0])
    var longestLineNum = 0
    var longestLine = ""
    var currentLineNum = 1

    filePath.forEachLine {
        if (it.length > longestLine.length) {
            longestLineNum = currentLineNum
            longestLine = it
        }
        currentLineNum += 1
    }
    println("Line ${longestLineNum} is the longest (length = ${longestLine.length})")
}