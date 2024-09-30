# Write a Python program to remove an item from a tuple.

a = (2,1,4,5,'t',7,8)

b = list(a)
b.remove('t')
b.remove(2)


a = tuple(b)
print(a)