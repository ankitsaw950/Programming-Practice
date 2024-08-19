package Practice_Questions;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =  sc.nextInt();

        int a=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                a++;
        }
        if(a==2)
            System.out.println("The number is perfect ");
        else
            System.out.println("the number is not perfect");
    }
}
