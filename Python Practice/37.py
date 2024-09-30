# Write a Python program to find the common elements in two lists.

a = [3,2,5,2,48,1]

b = [1,4,12,16,20,2,25]

c =[]
for i in a:
    if i in b and i not in c:
        c.append(i)
    
print(c)