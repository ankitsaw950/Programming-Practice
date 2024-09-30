# Write a Python program to remove duplicates from a list.


a = [1,5,2,1,0,5,2,1,0]
print(a)

# Convert the list to a set to remove duplicates
b = list(set(a))

# Convert the set back to a list
print(b)



# Using dictionary

d = list(dict.fromkeys(a))
print(d)

