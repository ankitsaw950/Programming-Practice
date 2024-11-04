# 15. Create a function in python that accepts a list of numbers and returns the largest number in the list. 

# def find_largest(numbers):
#     largest = numbers[0]
#     for num in numbers:
#         if num > largest:
#             largest = num
#     return largest

# # Test the function with a list of numbers

# numbers = [10, 20, 5, 15, 30]
# largest_number = find_largest(numbers)
# print("The largest number in the list is:", largest_number)

def find_largest(numbers):
    Largest=numbers[0]
    for num in numbers:
        if num>Largest:
            Largest=num
    return Largest   
    

numbers=[10, 20, 5, 15, 30]
LargestNumber = find_largest(numbers)
print("The largest number in the list is:",LargestNumber)