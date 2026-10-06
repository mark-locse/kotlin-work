// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal
import com.github.ajalt.mordant.widgets.Text

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        print("Invalid argument count.")
        exitProcess(1)
    }
    val terminal = Terminal()
    var temp = args[0].toInt()
    val max = args[1].toInt()
    val increment = args[2].toInt()
    while (temp <= max) {
        terminal.println(table {
            header { row("Celsius", "Fahrenheit")}
            body {row(temp, temp*9/5+32)}
        })
        temp += increment
    }
}
