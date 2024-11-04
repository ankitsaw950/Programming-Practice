# Simple calculator

def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    if b == 0:
        return "Error: Division by zero"
    else:
        return a / b    
    
def modulus(a, b):
    return a % b


# Test the calculator
a= int(input("Enter first number : "))
b= int(input("Enter second number : "))
print("Addition:", add(a, b))
print("Subtraction:", subtract(a, b))
print("Multiplication:", multiply(a, b))
print("Division:", divide(a, b))
print("Modulus:", modulus(a, b))
