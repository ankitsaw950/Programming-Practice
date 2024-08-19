package Practice_Questions;
import java.util.*;

public class PrimeNumberUsingRecursion {

    public static boolean Isprime(int num,int i)
    {
       if(i==1)
           return true;
       if(num%i==0)
           return false;

       return Isprime(num,i-1);

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean ans = Isprime(n,n/2);

        if(ans)
            System.out.println("The number is prime .");
        else
            System.out.println("The number is not prime .");


    }
}
