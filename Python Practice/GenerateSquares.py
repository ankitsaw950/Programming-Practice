# 17. WAP in python to use a list comprehension to generate a list of squares for the numbers from 1 to 20. 

#  First method
squares =[x**2 for x in range(1,21)]
print(squares)

#  Second Method

squares = []
for x in range(1,21):
    squares.append(x**2)

print(squares)