# 23. Write a class Employee that initializes with name and salary. Include a method to display the employee's details. 

class Employee:
    def __init__(self,name,salary):
        self.name = name
        self.salary = salary
    
    def display(self):
        print("Employee Details:")
        print(f"Name: {self.name}")
        print(f"Salary: {self.salary}")

Emp1 = Employee("Shubham",5000)
Emp1.display()