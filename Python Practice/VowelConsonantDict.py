# 12. Create a function that takes a string and returns a dictionary with the counts of vowels 
# and consonants. For example, for the input "Hello, World!", the function should 
# return {"vowels": 3, "consonants": 7}. Ignore case and non-alphabetic characters.

def count_vowels_consonants(s):
    vowels = "aeiouAEIOU"
    consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"
    vowel_count = 0
    consonant_count = 0
    
    for char in s:
        if char in vowels:
            vowel_count += 1
        elif char in consonants:
            consonant_count += 1

    return {"vowels": vowel_count, "consonants": consonant_count}

# Test the function

input_string = "Hello, World!"
result = count_vowels_consonants(input_string)
print(result)