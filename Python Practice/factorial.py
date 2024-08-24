# # Find the factorial of the given number

# def factorial(n):
#     if(n==0):
#         return 1
#     else :
#         return n * factorial(n-1)

# n = int(input("Enter a number: "))

# if n < 0:
#     print("Factorial is not defined for negative numbers.")
#     exit()

# elif (n == 0 or n == 1):
#     print("Factorial of", n, "is 1")

# else :
#     print("Factorial of", n, "is", factorial(n))


'''

factorial(n) = n * factorial(n-1)

for example :
5 = 5 * 4 * 3 * 2 * 1   =>120

factorial(5) = 5 * factorial(4)
                   = 4 * factorial(3)
                          = 3 * factorial(2)
                                  = 2 * factorial(1)
                                        = 1 * factorial(0)
                                                 = 1

'''



def countdown(n):
    if n <= 0:
        print("Blast off")
    else:
        print(n)
        countdown(n-1)  

n = int(input("Enter the number :"))
countdown(n)