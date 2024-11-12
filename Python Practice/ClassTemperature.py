# 29. Write a class Temperature with a static method celsius_to_fahrenheit that converts Celsius to Fahrenheit, and a class method from_kelvin that creates an instance from a   Kelvin value. 

class Temperature:
    def __init__(self, celsius):
        self.celsius = celsius

    @staticmethod
    def celsius_to_fahrenheit(celsius):
        """Converts Celsius to Fahrenheit."""
        return (celsius * 9/5) + 32

    @classmethod
    def from_kelvin(cls, kelvin):
        """Creates an instance of Temperature from a Kelvin value."""
        celsius = kelvin - 273.15
        return cls(celsius)

# Example usage
# Convert 25 degrees Celsius to Fahrenheit
print(Temperature.celsius_to_fahrenheit(25))

# Create an instance from 300 Kelvin
temp = Temperature.from_kelvin(300)
print(f"Celsius: {temp.celsius}")
print(f"Fahrenheit: {Temperature.celsius_to_fahrenheit(temp.celsius)}")
