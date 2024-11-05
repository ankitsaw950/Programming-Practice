# 22. Define a class called Book with attributes for title, author, and isbn. Include a method to display the book's information.

class Book:
    def __init__(self,title,author,isbn):
        self.title = title
        self.author = author
        self.isbn = isbn
    
    def display(self):
        print(f"Titile : {self.title}")
        print(f"Author : {self.author}")
        print(f"ISBN : {self.isbn}")


book1 = Book("1984", "George Orwell", "978-0451524935")

book1.display()
