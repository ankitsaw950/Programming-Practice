# 20. Create a function in python that takes a string and returns a dictionary with the frequency of each character in the string. 

def form_dict(str):
    dict={}
    
    for char in str:
        if char in dict:
            dict[char] += 1
        else:
            dict[char]=1
    return dict

# Example usage:
str="Hello, Ankit"

print(form_dict(str))