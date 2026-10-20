// Task 7.7.1: statistics functions
import kotlin.math.roundToInt
fun median_calc(list: List<Float>): Float{
    var median = 0f
    if (list.size > 0) {
        if (list.size % 2 == 0) {
            median = (list[list.size/2-1]+list[list.size/2])/2
        }
        else {
            median = list[list.size/2]
        }
        return median
    }
    else {
        throw IllegalArgumentException("cannot use empty list.")
    }
}

fun display_stats(list: List<Float>) = println("Median: ${median_calc(list)}\nMean: ${list.average()}\nMax: ${list.max()}\nMin: ${list.min()}")
