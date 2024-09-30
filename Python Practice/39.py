# Write a Python program to remove all odd numbers from a list.


# using filter function
a = [2,1,3,20,11,15,3,12,19,18,24,52,52.5]

a = list(filter(lambda x : x % 2 == 0,a))

print(a)

# using while loop 
b = [2, 1, 3, 20, 11, 15, 3, 12, 19, 18, 24, 52, 52.5]
i=0
while i<len(a):
    if (b[i] % 2 != 0 ):
        b.pop(i)
    else:
        i+=1

print(b)