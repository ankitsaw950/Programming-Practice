# Write a Python program to find all even numbers in a list.

a = [2,4,1,3,15,19,2,1,2.5]

b = []
for i in a:
    if(i%2==0):
        b.append(i)

print(b)