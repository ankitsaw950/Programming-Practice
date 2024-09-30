# Write a Python program to find the repeated items in a tuple.


a = (2, 1, 3, 1, 0, 1, 2, 1, 5)

count_dict = {}

# Iterate over the elements in the tuple to count occurrences
for item in a:
    if item in count_dict:
        count_dict[item] += 1
    else:
        count_dict[item] = 1

# Find the items that are repeated (i.e., count > 1)
repeated_items = {key: value for key, value in count_dict.items() if value > 1}

# Print the repeated items
print("Repeated items in the tuple:", repeated_items)
