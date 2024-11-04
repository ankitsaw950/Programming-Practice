import java.util.Scanner;

public class _9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input value for n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculate the sum of the series
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // Add even numbers and subtract odd numbers
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }

        // Display the result
        System.out.println("The sum of the series is: " + sum);
        
        scanner.close();
    }
}
