# * * * * *
# * * * *
# * * * 
# * *
# *

def print_pattern(n):
    while n >= 0:
        for j in range(n):
            print("*", end=" ")
        print()
        n-=1

print_pattern(5)