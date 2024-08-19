package Practice_Questions;
import java.util.*;

public class occurrenceOfCharacter {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        int[] count = new int[256];

        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }

        for (int i=0; i<count.length;i++)
        {
            if(count[i]>0)
            {
                char character = (char) i;
                int characterCount = count[i];
                System.out.println(character + ": " + characterCount);
            }
        }
    }
}
