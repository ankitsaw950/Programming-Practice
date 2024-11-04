# 19. Write a function in python that merges two dictionaries, adding values for keys that exist in both.

def merge_dictionaries(dict1, dict2):
    merged_dict = dict1.copy()  # Start with a copy of the first dictionary
    for key, value in dict2.items():
        if key in merged_dict:
            merged_dict[key] += value  # Add values for keys that exist in both
        else:
            merged_dict[key] = value  # Add new key-value pairs from the second dictionary
    return merged_dict

dict1 = {'a': 10, 'b': 20, 'c': 30}
dict2 = {'b': 5, 'c': 15, 'd': 25}

merged = merge_dictionaries(dict1, dict2)
print(merged)  # Output: {'a': 10, 'b': 25, 'c': 45, 'd': 25}
