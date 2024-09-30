
import java.util.*;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
public class SumOfNaturalNumberUsingRecursion {
    public static int sum(int num)
    {
        if (num==1)
            return num;
        return num + sum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int ans  =sum(n);
        System.out.println("The sum of first "+n + " digit is : "+ans);
    }
}
