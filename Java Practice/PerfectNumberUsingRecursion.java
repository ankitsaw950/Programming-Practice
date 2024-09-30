
import java.util.*;


public class PerfectNumberUsingRecursion {

    public static int perfect(int num,int i)
    {
    if(i==0)
        return 0;
    if(num%i==0)
        return i+perfect(num,i-1);
    else
        return perfect(num,i-1);

    }


    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int ans = perfect(n,n-1);

        if(ans==n)
            System.out.println("The number is perfect .");
        else
            System.out.println("The number is not perfect .");

    }
}
