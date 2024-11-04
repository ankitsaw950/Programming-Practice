# 14. Write a function in python that takes a list as an argument and returns a new list that is 
# the reverse of the original list.

def reverse_list(lst):
    return lst[::-1]

# Example usage:

original_list = [1, 2, 3, 4, 5]
reversed_list = reverse_list(original_list)
print(reversed_list)  # Output: [5, 4, 3, 2, 1]

