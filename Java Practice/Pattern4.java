package Practice_Questions;
        /*
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
 */

import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
