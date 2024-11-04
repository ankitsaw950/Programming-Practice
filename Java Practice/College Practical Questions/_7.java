import java.util.Scanner;

public class _7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sumOneDigit = 0;
        int sumTwoDigit = 0;

        // Input 10 integer values
        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            
            // Calculate sums based on digit length
            if (numbers[i] >= 0 && numbers[i] <= 9) {
                sumOneDigit += numbers[i];
            } else if (numbers[i] >= 10 && numbers[i] <= 99) {
                sumTwoDigit += numbers[i];
            }
        }

        // Display results
        System.out.println("Sum of one-digit numbers: " + sumOneDigit);
        System.out.println("Sum of two-digit numbers: " + sumTwoDigit);

        scanner.close();
    }
}
