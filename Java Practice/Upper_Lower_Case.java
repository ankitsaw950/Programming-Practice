package Practice_Questions;
import java.util.*;

public class Upper_Lower_Case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);

        if(ch>=97 && ch<=123)
            System.out.println("Lower case");
        else if(ch>=65 && ch<=96)
            System.out.println("Upper case");
        else if (ch>=48 && ch<=57)
            System.out.println("Digit");
    }
}
