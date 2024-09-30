# Write a Python program to find the index of an item in a tuple.

a = ("Ankit",23,1,2.5,'c')

for i in a:
    print(f"Index of '{i}' is : {a.index(i)} ")

# #output :
# Index of 'Ankit' is : 0 
# Index of '23' is : 1
# Index of '1' is : 2
# Index of '2.5' is : 3
# Index of 'c' is : 4