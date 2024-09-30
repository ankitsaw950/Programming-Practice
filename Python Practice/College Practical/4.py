# Check if the input value is an Armstrong number   
n = int(input("Enter the number: "))

def is_armstrong(num):
    digits = str(num)
    num_digits = len(digits)  # Number of digits in the number
    total = 0
    
    for digit in digits:
        total += int(digit) ** num_digits  # Sum of each digit raised to the power of num_digits

    return total

# Call the function and compare the result
if is_armstrong(n) == n:
    print(n, "is an Armstrong number.")
else:
    print(n, "is not an Armstrong number.")
