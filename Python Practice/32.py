# Write a Python program to find the largest and smallest elements in a list.

a = [2,1,5,9,3,0,1,15,-3]

# Find the largest element

largest = a[0]
for i in a:
    if i > largest:
        largest = i

# Find the smallest element

smallest = a[0]
for i in a:
    if i < smallest:
        smallest = i

print("The largest element is:", largest)

print("The smallest element is:", smallest)


# Find the largest and smallest elements in a list using built-in functions

print("The largest element is:", max(a))

print("The smallest element is:", min(a))



# Find the largest and smallest elements in a list using sort() function

a.sort()

print("The largest element is:", a[-1])

print("The smallest element is:", a[0])



# Find the largest and smallest elements in a list using lambda function

print("The largest element is:", max(a, key=lambda x: x))

print("The smallest element is:", min(a, key=lambda x: x))






