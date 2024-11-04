# 16. Write a function in python that takes a list and returns a new list with duplicates removed, preserving the original order of elements.

def remove_duplicates(lst):
    seen = set()
    result = []
    for item in list:
        if item not in seen:
            seen.add(item)
            result.append(item)
    return result

# Example usage:

original_list = [1, 2, 3, 2, 4, 5, 3, 6, 4, 7, 8, 9, 8, 10]
duplicate_free_list = remove_duplicates(original_list)
print(duplicate_free_list)  # Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]