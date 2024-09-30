
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum=0;
        int val=n;
        while(val>0)
        {
            int last=val%10;
            sum=sum+last;
//            System.out.println(sum);
            val=val/10;

        }
        System.out.println("The sum of digits present in "+ n + " is "+sum);
    }
}
