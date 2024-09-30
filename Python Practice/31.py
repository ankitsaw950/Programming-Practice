# Write a Python program to find the sum of all elements in a list.

a = [1, 2, 3, 4, 5]

# Using a for loop

total = 0

for i in a:
    total += i

print("The sum of all elements in the list is:", total)

# Using the built-in sum() function

print("The sum of all elements in the list is:", sum(a))
