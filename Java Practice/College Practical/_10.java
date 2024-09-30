import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the number of digits in the number
        int originalNumber = number;
        int numberOfDigits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of each digit raised to the power of numberOfDigits
        originalNumber = number;
        int sum = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
