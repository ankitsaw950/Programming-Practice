
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */
import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
