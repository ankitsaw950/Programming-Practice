package Practice_Questions;
/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
