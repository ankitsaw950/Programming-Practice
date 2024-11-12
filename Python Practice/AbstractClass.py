# 30. Use the abc module to create an abstract class Appliance with an abstract method turn_on. Implement this method in two derived classes: Washing Machine and Refrigerator. 

# In Python, abc stands for Abstract Base Classes, which is a module that provides the infrastructure for defining abstract base classes.

from abc import ABC, abstractmethod

class Appliance(ABC):
    @abstractmethod
    def turn_on(self):
        """Method to be implemented by all derived classes."""
        pass

class WashingMachine(Appliance):
    def turn_on(self):
        print("Washing Machine is now running. Water is filling the drum.")

class Refrigerator(Appliance):
    def turn_on(self):
        print("Refrigerator is now cooling. Compressor is activated.")

# Example usage
washing_machine = WashingMachine()
washing_machine.turn_on()

refrigerator = Refrigerator()
refrigerator.turn_on()
