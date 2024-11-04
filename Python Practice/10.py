# Function to print the diamond pattern
def print_diamond(n):
    
    for i in range(n):
        
        print(" " * (n - i - 1) + "*" * (2 * i + 1))
    
    
    for i in range(n - 1, 0, -1):
        
        print(" " * (n - i) + "*" * (2 * i - 1))


rows = int(input("Enter the number of rows: "))
print_diamond(rows)
