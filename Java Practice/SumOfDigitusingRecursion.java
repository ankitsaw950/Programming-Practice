package Practice_Questions;
import java.util.Scanner;


public class SumOfDigitusingRecursion {
    public static int sum(int n)
    {
        if(n==0)
            return 0;
        else
            return ((n%10)+sum(n/10));

    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        int ans = sum(n);
        System.out.println("Sum of digit is : "+ans);
    }
}
