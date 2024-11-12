# 11. Write a function that checks if one string is a rotation of another. For example, given the strings "abcde" and "deabc", the function should return True, but for "abcde" and "abced", it should return False.


def is_rotation(str1, str2):
    # If the lengths of the strings are not equal, they cannot be rotations of each other
    if len(str1) != len(str2):
        return False
    
    # Concatenate str1 with itself to form a larger string

    larger_str = str1 + str1
    
    # Check if str2 is a substring of the larger string
    return str2 in larger_str

# Example usage

str1 = "abcde"
str2 = "deabc"
print(is_rotation(str1, str2))  # Output: True

str3 = "abcde"

str4 = "abced"

print(is_rotation(str3, str4))  # Output: False


