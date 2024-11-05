# 26. Write a function that takes a list of objects (instances of different classes) and calls a describe method, where each class has its own implementation. 


class Dog:
    def describe(self):
        print("I am a dog. I can Bark.")

class Cat:
    def describe(self):
        print("I am a Cat. I can Meow.")

class Bird:
    def describe(self):
        print("I am a dog. I can chirp.")


def describe_method(objects):
    for obj in objects:
        obj.describe()

dog = Dog()
cat = Cat()
bird = Bird()

objects = [dog,cat,bird]

describe_method(objects)