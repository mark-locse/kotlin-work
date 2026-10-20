# Task 12.1: program that uses a Point object
import point
# Remember that you'll need an import statement to access the class!
p = point.Point(2.0,5.0)
p2 = point.Point(4.5,7.0)
print(p.x, p.y)
print(p.distance())
print(p.distanceTo(p2))