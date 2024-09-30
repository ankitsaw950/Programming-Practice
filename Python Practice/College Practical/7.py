# reverse the String

def reverse(s):
    reversed_str = ""  # Initialize an empty string to store the reversed string
    for char in s:
        reversed_str = char + reversed_str  # Prepend each character to reversed_str
    return reversed_str

# Example usage
str = input("Enter a string: ")
result = reverse(str)
print("Reversed string:", result)

