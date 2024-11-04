import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input octal number as a string to handle any leading zeros
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();

        // Convert octal to decimal
        int decimal = convertOctalToDecimal(octal);

        System.out.println("The decimal equivalent is: " + decimal);

        scanner.close();
    }

    public static int convertOctalToDecimal(String octal) {
        int decimal = 0;
        int length = octal.length();

        // Iterate over each digit of the octal number
        for (int i = 0; i < length; i++) {
            char ch = octal.charAt(i);  // Get the current character
            int digit = ch - '0';  // Convert char to int

            // Convert and accumulate the decimal value
            decimal += digit * Math.pow(8, length - i - 1);
        }

        return decimal;
    }
}
