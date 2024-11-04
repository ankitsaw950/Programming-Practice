import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Input number to check
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is a perfect square
        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
        
        scanner.close();
    }

    public static boolean isPerfectSquare(int n) {
        if (n < 0) return false;  // Negative numbers cannot be perfect squares
        
        int sqrt = (int) Math.sqrt(n);  // Calculate the integer part of the square root
        return (sqrt * sqrt == n);  // Check if the square of sqrt equals the original number
    }
}
