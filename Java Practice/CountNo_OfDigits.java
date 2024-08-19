package Practice_Questions;
import java.util.*;
public class CountNo_OfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int digit=0;
        int val=n;
        while(val>0)
        {
            val=val/10;
            digit++;
        }
        System.out.println("The no. of digits present in "+ n + " is "+digit);
    }
}
