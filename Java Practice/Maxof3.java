

import java.util.Scanner;
public class Maxof3 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();

        if (a>b && a>c)
        {
            System.out.print("Maximum value = "+a);
        }
        else if (b>a && b>c)
        {
            System.out.print("Maximum value = "+b);
        }
        else if(c>a && c>b)
        {
            System.out.print("Maximum value = "+c);
        }
        else
        {
            System.out.print("All numbers are same ");
        }
    }
}
