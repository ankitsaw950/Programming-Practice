// import java.util.Scanner;

// // Program to calculate the roots of a quadratic equation ax^2 + bx + c = 0

// public class _1{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input coefficients a, b, c
//         System.out.print("Enter coefficient a: ");
//         double a = scanner.nextDouble();

//         System.out.print("Enter coefficient b: ");
//         double b = scanner.nextDouble();

//         System.out.print("Enter coefficient c: ");
//         double c = scanner.nextDouble();

//         // Calculate the discriminant
//         double discriminant = b * b - 4 * a * c;

//         // Check the nature of the roots
//         if (discriminant > 0) {
//             // Two real and distinct roots
//             double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//             double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//             System.out.println("Roots are real and distinct:");
//             System.out.println("Root 1 = " + root1);
//             System.out.println("Root 2 = " + root2);
//         } else if (discriminant == 0) {
//             // Two real and equal roots
//             double root = -b / (2 * a);
//             System.out.println("Roots are real and equal:");
//             System.out.println("Root = " + root);
//         } else {
//             // Complex roots
//             double realPart = -b / (2 * a);
//             double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
//             System.out.println("Roots are complex and distinct:");
//             System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
//             System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
//         }

//         scanner.close();  
// }

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coefficient of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the coefficient of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the coefficient of c : ");
        int c = sc.nextInt();

        int disc = b * b - 4 * a * c;

        if (disc > 0) {
            double r1 = (-b + Math.sqrt(disc)) / (2 * a);
            double r2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Roots are real and distinct : ");
            System.out.println("Root 1 : " + r1);
            System.out.println("Root 2 : " + r2);
        } else if (disc == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal :");
            System.out.println("Root : " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-disc) / (2 * a);
            System.out.println("Roots are imaginary and distinct ");
            System.out.println("Root 1 : " + real + "+" + imag+"i");
            System.out.println("Root 2 : " + real + "-" + imag+"i");
        }
    }
}
