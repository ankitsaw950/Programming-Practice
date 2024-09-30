# Write a Python program to sort a dictionary by its keys

# Define the dictionary

dictionary = {'name': 'Ankit', 'age': 23, 'location': 'India'}

# Convert the dictionary to a list of tuples

sorted_list = sorted(dictionary.items())

# Sort the list of tuples by the keys

sorted_list.sort(key=lambda x: x[0])

# Convert the sorted list of tuples back to a dictionary

sorted_dict = dict(sorted_list)

# Print the resulting dictionary

print(sorted_dict)


