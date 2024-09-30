# Write a Python program to find the second largest number in a list.

a = [1, 2, 3, 4, 5, 5]

smax =a[0]
max=a[0]

for i in a:
    if i>max:
        smax=max
        max=i
    elif i<max and i>smax:
        smax=i

print(f"Maximum element : {max}")
print(f"Second Maximum element : {smax}")