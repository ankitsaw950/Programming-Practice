# Write a Python program to create a dictionary from two lists.

# Define the two lists
keys = ['name', 'age', 'location']
values = ['Ankit', 23, 'India']


dictionary = {}

i=0
while i<len(keys):
    dictionary[keys[i]] = values[i]
    i+=1

# Print the resulting dictionary
print(dictionary)


# iteratimg over the dictioanry
for key in dictionary:
    print(key,dictionary[key])

