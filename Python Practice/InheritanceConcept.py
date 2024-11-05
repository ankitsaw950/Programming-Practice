# 25. Define two classes Teacher and Researcher. Create a third class Professor that inherits from both and includes a method to display the professor's information.

class Teacher:
    def __init__(self, name, subject):
        self.name = name
        self.subject = subject

    def display_teacher_info(self):
        print(f"Teacher Name: {self.name}")
        print(f"Subject: {self.subject}")

class Researcher:
    def __init__(self, field):
        self.field = field

    def display_researcher_info(self):
        print(f"Research Field: {self.field}")

class Professor(Teacher, Researcher):
    def __init__(self, name, subject, field, position):
        Teacher.__init__(self, name, subject)
        Researcher.__init__(self, field)
        self.position = position

    def display_info(self):
        print(f"Position: {self.position}")
        self.display_teacher_info()
        self.display_researcher_info()

# Example usage:
prof = Professor("Dr. Smith", "Physics", "Quantum Mechanics", "Professor")
prof.display_info()
