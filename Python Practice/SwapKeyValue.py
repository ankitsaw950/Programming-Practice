# 21. Create a function in python that takes a dictionary and returns a new dictionary with keys and values swapped.

def swap(dict):
    new_dict = {}
    for key, value in dict.items():
        new_dict[value] = key
    return new_dict

# Example usage
dict = {'a': 1, 'b': 2, 'c': 3}
print(swap(dict))