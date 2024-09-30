

import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("The entered number is even .");
        }
        else
        {
            System.out.println("The entered number is odd");
        }
    }
}
