# 27. Create a class Point that supports subtraction of two points using the - operator by overloading the __sub__ method. 


class Point:
    def __init__(self,x,y):
        self.x=x
        self.y=y
    
    def __sub__(self,obj):
        return Point(self.x-obj.x,self.y-obj.y)
    
    def __str__(self):
        return f"Point({self.x},{self.y})"

point1 = Point(5,3)
point2 = Point(2,1)
result =point1-point2

print(result)