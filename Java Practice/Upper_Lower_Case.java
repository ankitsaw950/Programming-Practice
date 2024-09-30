
// import java.util.*;

// public class Upper_Lower_Case {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the character : ");
//         char ch = sc.next().charAt(0);

//         if(ch>=97 && ch<=123)
//             System.out.println("Lower case");
//         else if(ch>=65 && ch<=96)
//             System.out.println("Upper case");
//         else if (ch>=48 && ch<=57)
//             System.out.println("Digit");
//     }
// }



import java.util.Scanner;

public class Upper_Lower_Case {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Counters for each category
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int alphanumericCount = 0;

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is an Uppercase letter.");
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                System.out.println(ch + " is a Lowercase letter.");
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a Digit.");
                digitCount++;
            }

            // Check if the character is alphanumeric (letter or digit)
            if (Character.isLetterOrDigit(ch)) {
                alphanumericCount++;
            }
        }

        // Output the counts
        System.out.println("Total Uppercase letters: " + upperCaseCount);
        System.out.println("Total Lowercase letters: " + lowerCaseCount);
        System.out.println("Total Digits: " + digitCount);
        System.out.println("Total Alphanumeric characters: " + alphanumericCount);
    }
}
