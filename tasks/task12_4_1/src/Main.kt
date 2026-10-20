// Task 12.4.1: main program
fun main() {
    val circle = Circle(Point(1.0, 2.0), 3.0)
    println("Circle area: ${circle.area()}")
    println("Circle perimeter: ${circle.perimeter()}")
    println("Circle contains point (2.0, 3.0): ${circle contains Point(2.0, 3.0)}")
}