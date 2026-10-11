// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    return false
} 

fun triangleArea(triangle: Triangle): Double {
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()
    val semiperimeter = 0.5*(a+b+c)
    val area = kotlin.math.sqrt(semiperimeter*(semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c))
    return 0.0
}