package Practice_Questions;
import java.util.*;


public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        int len = 0;

        try
        {
            while(str.charAt(len)!='\0')
                len++;
        }
        catch (IndexOutOfBoundsException e)
        {
            // yaha pe tabhi yaenge jab string khatam ho jayega
        }
        System.out.println("The lenght of the string is : "+len);
    }
}
