package Practice_Questions;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :");
        int  n = sc.nextInt();

        // Count the number of digits
        int digit=0;
        int val=n;
        while(val>0)
        {
            val=val/10;
            digit++;
        }

        // Now check the condition for armstrong number
        int ans=0;
        val=n;
        while(val>0)
        {
            int last = val%10;
            ans += Math.pow(last,digit);
            val=val/10;
        }

        if(ans==n)
            System.out.println("The number is armstrong");
        else
            System.out.println("The number is not Armstrong");
    }
}
