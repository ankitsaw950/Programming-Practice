package Practice_Questions;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum =0 ;
        int x =n;
        while(x>0)
        {
            int last = x%10;
            sum =sum*10 +last;
            x=x/10;
        }
        if(sum==n) System.out.println("The number is palindrome.");
        else System.out.println("The number is not palindrome.");
    }
}
