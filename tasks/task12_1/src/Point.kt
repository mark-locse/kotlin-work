// Task 12.1: Point class
import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance(): Double = hypot(x,y)
    fun distanceTo(point: Point): Double {
        return hypot((x-point.x),(y-point.y))
    }
}