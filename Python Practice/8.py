# * 
# * *
# * * *
# * * * * 
# * * * * *

def print_pattern(n):
    for i in range(n+1):
        for j in range(i):
            print("*", end=" ")
        print()

print_pattern(5)


