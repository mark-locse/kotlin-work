# Task 12.1: Point class
from math import hypot
class Point:
    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    def distance(self):
        return hypot(self.x, self.y)
    def distanceTo(self, other):
        return hypot(self.x - other.x, self.y - other.y)