n = int(input("Enter the number : "))

def mySqrt(x):
        if x == 1:
            return x
        ans = 0
        left, right = 1, x // 2
        
        while left <= right:
            mid = (left + right) // 2
            squared = mid * mid
            
            if squared == x:
                return mid
            elif squared < x:
                ans = mid
                left = mid + 1
            else:
                right = mid - 1
        
        return ans

result = mySqrt(n)
print(f'The square root of {n} is :  {result}')

# l=5
# ans=5/2
# print(ans)