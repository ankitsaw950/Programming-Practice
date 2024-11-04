# 18. Write a function in python that takes a tuple and an element as arguments, returning the number of times the element appears in the tuple.

def count_element(tup, element):
    return tup.count(element)

# Test the function
tup = (2,4,1,6,74,8,1,1,1,1)

print(count_element(tup, 1))  # Output: 4

#  Second method

def count_element_v2(tup, element):
    return sum(1 for item in tup if item == element)

print(count_element_v2(tup, 1))  # Output: 4

# Third method
def count_element(tup,element):
    count=0
    for i in tup:
        if i==element:
            count+=1
    return count

print(count_element(tup, 1))  # Output: 4