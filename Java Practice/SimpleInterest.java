package Practice_Questions;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
        System.out.print("Enter the price : ");
        float p = sc.nextFloat();

        System.out.print("Enter the rate : ");
        float r = sc.nextFloat();

        System.out.print("Enter the time : ");
        int t = sc.nextInt();

        double si = (p*r*t)/100;
        System.out.println("The simple interest is : "+si);
    }
}
