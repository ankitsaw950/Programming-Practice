# 13. Write a function that takes a string and returns the first non-repeated character. If all 
# characters are repeated, return None. For example, for the input "swiss", the function 
# should return 'w', while for "aabbcc", it should return None. 

def first_non_repeated_char(s):
    char_count ={}
    for char in s:
        if char in char_count:
            char_count[char]+=1
        else:
            char_count[char]=1
        
    for char in char_count:
        if char_count[char]==1:
            return char
    
    return None

print(first_non_repeated_char("swwiiss"))  # Output: 'w'