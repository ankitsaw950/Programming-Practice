import java.util.Scanner;

public class HappyNumber {
    
    // Function to calculate the sum of squares of digits of a number
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    // Function to check if the number is a happy number
    public static boolean isHappyNumber(int num) {
        int slow = num;
        int fast = num;
        
        // Using the Floyd's Cycle-Finding Algorithm (Tortoise and Hare)
        do {
            slow = sumOfSquares(slow);           // move slow one step
            fast = sumOfSquares(sumOfSquares(fast)); // move fast two steps
        } while (slow != fast);
        
        // If fast reaches 1, it's a happy number
        return slow == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Check if it's a happy number
        if (isHappyNumber(num)) {
            System.out.println(num + " is a Happy Number.");
        } else {
            System.out.println(num + " is not a Happy Number.");
        }
    }
}
