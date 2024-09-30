
import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int val=n;
        int ans=0;
        while(val>0)
        {
            int last = val%10;
            ans=ans*10 + last;
            val=val/10;
        }
        System.out.println("The reverse of the "+ n + " is "+ans);
    }
}
