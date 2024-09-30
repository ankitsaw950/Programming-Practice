
/*
1 2 3 4 5
 1 2 3 4
   1 2 3
     1 2
       1
*/

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Print numbers with a space between them
            for (int k = 1; k <= i; k++) {
                System.out.print(k );
            }
            System.out.println();
        }
    }
}

