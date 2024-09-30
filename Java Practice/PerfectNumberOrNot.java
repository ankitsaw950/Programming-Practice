
import java.util.*;
public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int val = n;
        int ans=0;
        for(int i=1;i<val;i++)
        {
            if(val%i==0)
                ans += i;
//            System.out.println(ans);
        }
        if(ans==n)
            System.out.println("The number is perfect");
        else
            System.out.println("The number is not perfect");
    }
}
