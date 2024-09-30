# Write a Python program to reverse a tuple.

a = ("Ankit",'c',3.9,92,1,2,4,0)

reverse = tuple(reversed(a))

print(reverse)

# Another method by using the slicing method
print(a[::-1])