# Write a Python program to count the occurrences of an item in a tuple.

a = (2,1,5,2,1,4,5,5,67,8,8,9,9)

Count_dict ={}

for item in a:
    if item in Count_dict:
        Count_dict[item]+=1
    else :
        Count_dict[item]=1


for item , count in Count_dict.items():
    print(f"The count of {item} in the tuple is : {count}")