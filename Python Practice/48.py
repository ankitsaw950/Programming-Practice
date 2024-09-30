# Write a Python program to replace the last value of tuples in a list.


tuples_list = [(1, 2, 3), (4, 5, 6), (7, 8, 9)]

new_value = 100

# Replace the last value of each tuple
updated_tuples_list = [t[:-1] + (new_value,) for t in tuples_list]


print(updated_tuples_list)
