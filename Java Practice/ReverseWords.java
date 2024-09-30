
import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

       String result = "";
       for(int i=str.length()-1;i>=0;i--)
       {
           result +=str.charAt(i);
       }

        System.out.println("The reverse of the given word is "+ str + "  is "+result);
    }
}
