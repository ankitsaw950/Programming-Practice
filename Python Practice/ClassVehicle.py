# 24. Create a base class Vehicle with a method start_engine. Then, create a derived class  Bike that overrides the start_engine method to return "Bike engine started." 

class Vehicle:
    def start_engine(self):
        print("Engine Started.")
    
class Bike(Vehicle):
    def start_engine(self):
        print("Bike Engine Started.")
    
# Test the derived class Bike
bike = Bike()
bike.start_engine()