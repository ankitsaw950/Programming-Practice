# fibonacci series

def fibonacci(n):
   a,b = 0 , 1
   series = []

   for __ in range(n):
      series.append(a)
      a, b = b, a+b

   return series
   
# Input: Number of terms
terms = int(input("Enter the number of terms: "))

# Generating and printing the Fibonacci series
print("Fibonacci Series:", fibonacci(terms))    
